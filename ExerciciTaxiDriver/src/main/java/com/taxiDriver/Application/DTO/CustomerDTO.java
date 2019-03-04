package com.taxiDriver.Application.DTO;

import com.google.gson.annotations.Expose;
import com.taxiDriver.Domain.Customer;
import com.taxiDriver.Utilities.NotFoundException;


public class CustomerDTO {
    @Expose
    private Integer id;
    @Expose
    private String name, lastName, email, dni;
    private String password;

    public CustomerDTO(){}

    public CustomerDTO(Customer customer) throws NotFoundException {
        if (customer == null)
            throw new NotFoundException();

        name = customer.getName();
        lastName= customer.getLastName();
        email = customer.getEmail();
        password = customer.getPassword();
        dni = customer.getDni();
        id = customer.getId();
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

    public String getDni() {
        return dni;
    }
}

