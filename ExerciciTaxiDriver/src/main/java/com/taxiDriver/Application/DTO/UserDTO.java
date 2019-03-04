package com.taxiDriver.Application.DTO;

import com.google.gson.annotations.Expose;
import com.taxiDriver.Utilities.InvalidParamException;

public class UserDTO {

    @Expose
    private Integer userId;
    @Expose
    private String name, lastName, email, id;

    public UserDTO(CustomerDTO customer) throws InvalidParamException {
        if (customer == null)
            throw new InvalidParamException();

        this.userId = customer.getId();
        this.name = customer.getName();
        this.lastName = customer.getLastName();
        this.email = customer.getEmail();
        this.id = customer.getDni();
    }

    public UserDTO(DriverDTO driver) throws InvalidParamException {
        if (driver == null)
            throw new InvalidParamException();

        this.userId = driver.getId();
        this.name = driver.getName();
        this.lastName = driver.getLastName();
        this.email = driver.getEmail();
        this.id = driver.getDriverId();
    }
}
