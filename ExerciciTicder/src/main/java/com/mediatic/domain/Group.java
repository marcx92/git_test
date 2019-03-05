package com.mediatic.domain;

import java.util.ArrayList;
import java.util.List;

public class Group {

	private List<Student> studentList = new ArrayList<>();

	public Group(){}

	public Group(List<Student> studentList) {

		this.studentList.addAll(studentList);

	}

	public List<Student> getStudentList() {
		return studentList;
	}
}
