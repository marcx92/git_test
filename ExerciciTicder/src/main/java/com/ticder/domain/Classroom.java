package com.ticder.domain;

import java.util.ArrayList;
import java.util.List;

import com.ticder.applicationDTO.ClassroomDTO;
import com.ticder.utilities.InvalidParamException;

public class Classroom {
	
	private Integer classId;
	private List<Student> allStudents = new ArrayList<Student>();
	
	public Classroom() {
		
	}
	
	public Classroom(ClassroomDTO classroomDto) throws InvalidParamException {
		if(classroomDto == null)
			throw new InvalidParamException();
		
		this.classId = classroomDto.getClassId();
		//this.allStudents.addAll(allStudents);
		
	}
	
	
	public Integer getClassId() {
		return classId;
	}
	public List<Student> getAllStudents() {
		return allStudents;
	}
	
	public void addStudent(Student student) {
		this.allStudents.add(student);
	}
	
	public void deleteStudent() {
		this.allStudents = new ArrayList<Student>();
	}

}
