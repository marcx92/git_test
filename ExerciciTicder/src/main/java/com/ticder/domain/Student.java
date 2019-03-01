package com.ticder.domain;

import com.ticder.applicationDTO.StudentDTO;
import com.ticder.utilities.InvalidParamException;

public class Student {
	
	private Integer studentId;
	private String nameStudent;
	
	public Student() {
		
	}
	
	public Student(StudentDTO studentDto) throws InvalidParamException {
		if(studentDto == null)
			throw new InvalidParamException();
		
		this.studentId = studentDto.getStudentId();
		this.nameStudent = studentDto.getNameStudent();			
	}

	public Integer getStudentId() {
		return studentId;
	}

	public String getNameStudent() {
		return nameStudent;
	}
	
	

}
