package com.mediatic.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.mediatic.application.dto.GroupDTO;
import com.mediatic.application.dto.StudentDTO;
import com.mediatic.domain.Group;
import com.mediatic.domain.Student;
import com.mediatic.repository.StudentRepository;
import com.mediatic.util.InvalidParamException;
import com.mediatic.util.NotFoundException;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

	private StudentRepository repository = new StudentRepository();
	
	public StudentDTO register(StudentDTO studentDTO) throws InvalidParamException {
		
		Student student = new Student(studentDTO.getName());
		repository.saveStudent(student);
		return new StudentDTO(student);
	}
	
	public StudentDTO delete(int idStudent) throws InvalidParamException, NotFoundException {

		Student student = repository.getStudentById(idStudent);
		repository.removeStudent(student);
		return new StudentDTO(student);
	}
	
	public StudentDTO getStudentById(int idStudent) throws NotFoundException, InvalidParamException {
		
		Student student = repository.getStudentById(idStudent);
		return new StudentDTO(student);
	}
	
	public List<StudentDTO> listStudents() throws NotFoundException, InvalidParamException {
		List<Student> studentList = repository.getAllStudents();
		List<StudentDTO> studentDTOList = new ArrayList<>();
		if (studentList.isEmpty())
			throw new NotFoundException();
		for (Student s : studentList) {
			studentDTOList.add(new StudentDTO(s));
		}
		return studentDTOList;
	}
	
	public StudentDTO getStudentByName(String name) throws InvalidParamException, NotFoundException {
		Student student = repository.getStudentByName(name);
		return new StudentDTO(student);
	}

	private int getGroupSize(int arraySize){
		int groupSize;
		if (arraySize % 2 == 0)
			groupSize = 2;
		else
			groupSize = 3;
		return groupSize;
	}

	private Random randomGenerator(){
		return new Random();
	}

	private void addStudentsToGroups(List<Student> studentList, List<Student> studentsToGroup){
		for (int i=0; i < getGroupSize(studentList.size()); ++i) {
			Student student = studentList.get(randomGenerator().nextInt(studentList.size()));
			studentsToGroup.add(student);
			studentList.remove(student);
		}
	}

	private List<Group> groupGenerator(){
		List<Student> studentList = repository.getAllStudents();
		List<Student> studentsToGroup = new ArrayList<>();
		List<Group> groupsList = new ArrayList<>();

		while (studentList.size() > 0){
			addStudentsToGroups(studentList, studentsToGroup);
			Group groupedStudents = new Group(studentsToGroup);
			groupsList.add(groupedStudents);
			studentsToGroup.clear();
		}
		return groupsList;
	}

	public List<GroupDTO> getGroups() throws InvalidParamException {
		List<GroupDTO> groupDTOList = new ArrayList<>();
		for (Group group : groupGenerator()) {
			GroupDTO groupDTO = new GroupDTO(group);
			groupDTOList.add(groupDTO);
		}
		return groupDTOList;
	}

}
