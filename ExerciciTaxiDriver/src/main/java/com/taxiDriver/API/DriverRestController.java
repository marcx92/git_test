package com.taxiDriver.API;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.taxiDriver.Application.DTO.DriverDTO;
import com.taxiDriver.Application.DriverController;
import com.taxiDriver.Utilities.InvalidParamException;
import com.taxiDriver.Utilities.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class DriverRestController {

    @Autowired
    private DriverController controller;

    private String toJson(Object object){

        Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        return gson.toJson(object);
    }

    @PostMapping(value = "/users/drivers", produces = "application/json;charset=UTF-8")
    public String register(@RequestBody String jDriver) throws InvalidParamException, NotFoundException {

        DriverDTO newDriver = new Gson().fromJson(jDriver, DriverDTO.class);

        DriverDTO driver = controller.registerDriver(newDriver);

        return toJson(driver);
    }

    @GetMapping(value = "/users/drivers", produces = "application/json;charset=UTF-8")
    public String listDrivers() throws NotFoundException {

        List<DriverDTO> drivers = controller.getAllDrivers();

        return toJson(drivers);
    }
}
