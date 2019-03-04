package com.taxiDriver.Application.DTO;

import com.google.gson.annotations.Expose;
import com.taxiDriver.Domain.Driver;
import com.taxiDriver.Utilities.NotFoundException;

public class DriverDTO {

    @Expose
    private Integer id;
    @Expose
    private String name, lastName, email, driverId;
    private String password;

    public DriverDTO(){}

    public DriverDTO(Driver driver) throws NotFoundException {
        if (driver == null)
            throw new NotFoundException();

        name = driver.getName();
        lastName= driver.getLastName();
        email = driver.getEmail();
        password = driver.getPassword();
        driverId = driver.getDriverId();
        id = driver.getId();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        if(name == null)
            return "";
        return name;
    }

    public String getLastName() {
        if(lastName == null)
            return "";
        return lastName;
    }

    public String getEmail() {
        if(email == null)
            return "";
        return email;
    }

    public String getPassword() {
        if(password == null)
            return "";
        return password;
    }

    public String getDriverId() {
        return driverId;
    }
}
