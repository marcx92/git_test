package com.taxiDriver.Domain;

import com.taxiDriver.Utilities.InvalidParamException;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "Driver")
public class Driver extends User {

    @Column(name = "id")
    private String driverId;

    public Driver(){}

    public Driver(String name, String lastName, String email, String password, String driverId) throws InvalidParamException {
        super(name, lastName, email, password);

        if (driverId == null || driverId.equals("") || driverId.matches("[$&+,:;=?@#|'<>.^*()%!-]") || driverId.length() != 12)
            throw new InvalidParamException();
        this.driverId = driverId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }
}
