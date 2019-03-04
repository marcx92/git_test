package com.taxiDriver.Persistence;

import com.taxiDriver.Domain.Customer;
import com.taxiDriver.Utilities.InvalidParamException;
import com.taxiDriver.Utilities.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {

    @Autowired
    private HelperCustomerRepository repository;

    public CustomerRepository(){}

    public void save (Customer customer) throws InvalidParamException {
        if (customer == null)
            throw new InvalidParamException();
        if (repository.existsByEmail(customer.getEmail())) {
            throw new InvalidParamException();
        }else{
            repository.save(customer);
        }
    }

    public void removeCustomer(int customerId) throws NotFoundException, InvalidParamException {
        if (customerId == 0)
            throw new InvalidParamException();
        if (repository.existsById(customerId)) {
            repository.deleteById(customerId);
        }else{
            throw new NotFoundException();
        }
    }

    public void removeCustomerByEmail(String email) throws NotFoundException, InvalidParamException {
        if (email.equals("") || !email.contains("@") || !email.contains(".com"))
            throw new InvalidParamException();
        if (repository.existsByEmail(email)) {
            repository.deleteByEmail(email);
        }else{
            throw new NotFoundException();
        }
    }

    public void removeAllCustomers(){
        repository.deleteAll();
    }

    public List<Customer> getAllCustomer () {
        return (List<Customer>) repository.findAll();
    }

    public boolean customerExistById(int customerId) throws InvalidParamException {
        if (customerId <= 0)
            throw new InvalidParamException();
        return repository.existsById(customerId);
    }
}
