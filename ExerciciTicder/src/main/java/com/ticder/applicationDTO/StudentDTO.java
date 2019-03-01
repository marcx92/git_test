package com.ticder.applicationDTO;


import com.ticder.domain.Student;
import com.ticder.utilities.InvalidParamException;

public class StudentDTO {
	
	private int studentId;
	private String nameStudent;
	
	public StudentDTO() {
		
	}
	
	public StudentDTO(Student student) throws InvalidParamException {
		if(student == null)
			throw new InvalidParamException();
		
		this.studentId = student.getStudentId();
		this.nameStudent = student.getNameStudent();
	}

	public int getStudentId() {
		return studentId;
	}

	public String getNameStudent() {
		if(nameStudent == null)
			return "";
		return nameStudent;
	}
	
	

}
