package com.mediatic.application.dto;

import com.google.gson.annotations.Expose;
import com.mediatic.domain.Group;
import com.mediatic.domain.Student;
import com.mediatic.util.InvalidParamException;

import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.List;

public class GroupDTO {

    @Expose
    private List<StudentDTO> studentDTOList = new ArrayList<>();

    public GroupDTO(Group group) throws InvalidParamException {
        if (group == null)
            throw new InvalidParamException();

        for (Student student: group.getStudentList()) {
            StudentDTO studentDTO = new StudentDTO(student);
            studentDTOList.add(studentDTO);
        }
    }

    public List<StudentDTO> getStudentDTOList() {
        return studentDTOList;
    }

}
