package com.taxiDriver.Domain;

import com.taxiDriver.Utilities.InvalidParamException;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "Customer")
public class Customer extends User {

    @Column(name = "id")
    private String dni;

    public Customer(){}

    public Customer(String name, String lastName, String email, String password, String dni) throws InvalidParamException {
       super(name, lastName, email, password);

       if (dni == null || dni.equals("") || dni.matches("[$&+,:;=?@#|'<>.^*()%!-]") || dni.length() != 9)
           throw new InvalidParamException();
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
