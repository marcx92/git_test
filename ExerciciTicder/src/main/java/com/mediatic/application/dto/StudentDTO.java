package com.mediatic.application.dto;

import com.google.gson.annotations.Expose;
import com.mediatic.domain.Student;
import com.mediatic.util.InvalidParamException;

public class StudentDTO {

	@Expose
	private Integer idStudent;
	@Expose
	private String name;

	public StudentDTO(Student student) throws InvalidParamException {
		if (student == null)
			throw new InvalidParamException();
		this.idStudent = student.getIdStudent();
		this.name = student.getName();
	}

	public Integer getIdStudent() {
		return idStudent;
	}

	public String getName() {
		return name;
	}

}
