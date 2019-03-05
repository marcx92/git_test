package com.mediatic.repository;

import java.util.ArrayList;
import java.util.List;

import com.mediatic.domain.Student;
import com.mediatic.util.InvalidParamException;
import com.mediatic.util.NotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class StudentRepository {

	private static List<Student> listStudent = new ArrayList<>();
	
	public List<Student> getAllStudents(){
		return new ArrayList<>(listStudent);
	}	
	
	public void saveStudent(Student student) throws InvalidParamException{
		if(student==null) {
	        throw new InvalidParamException();
	    }
		listStudent.add(student);
	}

    public void removeStudent(Student student) throws InvalidParamException{
		if(student == null)
		    throw new InvalidParamException();
		listStudent.remove(student);
	}
    
    public Student getStudentById(int idStudent) throws InvalidParamException, NotFoundException {
		if (idStudent <= 0)
			throw new InvalidParamException();
    	for (Student student : listStudent)
    		if (student.getIdStudent() == idStudent)
    			return student;
    	throw new NotFoundException();
    }

    public Student getStudentByName(String name) throws NotFoundException, InvalidParamException {
		if (name.equals(""))
			throw new InvalidParamException();
    	for (Student student : listStudent)
    		if (student.getName().equals(name))
    			return student;
    	throw new NotFoundException();
    }
}
