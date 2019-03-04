package com.taxiDriver.API;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.taxiDriver.Application.DTO.DriverDTO;
import com.taxiDriver.Application.DTO.UserDTO;
import com.taxiDriver.Application.UserController;
import com.taxiDriver.Utilities.InvalidParamException;
import com.taxiDriver.Utilities.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class UserRestController {

    private String toJson(Object object){

        Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        return gson.toJson(object);
    }

    @Autowired
    private UserController userController;

    @GetMapping(value = "/users", produces = "application/json;charset=UTF-8")
    public String listUsers() throws NotFoundException, InvalidParamException {

        List<UserDTO> users = userController.getAllUsers();

        return toJson(users);

    }

    @DeleteMapping(value="/users",produces = "application/json;charset=UTF-8")
    public void remove() throws Exception {

        userController.deleteAllUsers();

    }
}
