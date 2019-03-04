package com.taxiDriver.Persistence;

import com.taxiDriver.Domain.Driver;
import com.taxiDriver.Utilities.InvalidParamException;
import com.taxiDriver.Utilities.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DriverRepository {

    @Autowired
    private HelperDriverRepository repository;

    public DriverRepository() {
    }

    public void save(Driver driver) throws InvalidParamException {
        if (driver == null)
            throw new InvalidParamException();
        if (repository.existsByEmail(driver.getEmail())) {
            throw new InvalidParamException();
        } else {
            repository.save(driver);
        }
    }

    public void removeAllDrivers() {
        repository.deleteAll();
    }

    public List<Driver> getAllDrivers(){
        return (List<Driver>) repository.findAll();
    }

    public boolean customerExistById(int customerId) throws InvalidParamException {
        if (customerId <= 0)
            throw new InvalidParamException();
        return repository.existsById(customerId);

    }
}