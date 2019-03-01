package com.ticder.applicationDTO;

import java.util.ArrayList;
import java.util.List;

import com.ticder.domain.Classroom;
import com.ticder.domain.Student;
import com.ticder.utilities.InvalidParamException;

public class ClassroomDTO {
	
	private int classId;
	private List<StudentDTO> allStudents = new ArrayList<StudentDTO>();
	
	public ClassroomDTO() {
		
	}
	
	public ClassroomDTO(Classroom classroom) throws InvalidParamException {
		if(classroom == null)
			throw new InvalidParamException();
		
		this.classId = classroom.getClassId();
		this.allStudents = convertToDTO(classroom.getAllStudents());
	}
	
	private List<StudentDTO> convertToDTO(List<Student> allStudent) throws InvalidParamException {
		List<StudentDTO> results = new ArrayList<>();
		for (Student  s: allStudent) {
			results.add(new StudentDTO(s));
		}
		return results;
		
	}
	
	public Integer getClassId() {
		return classId;
	}
	public List<StudentDTO> getAllStudents() {
		return allStudents;
	}
	
	

}
