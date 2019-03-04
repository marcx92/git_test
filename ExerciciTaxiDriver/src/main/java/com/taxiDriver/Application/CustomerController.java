package com.taxiDriver.Application;

import com.taxiDriver.Application.DTO.CustomerDTO;
import com.taxiDriver.Domain.Customer;
import com.taxiDriver.Persistence.CustomerRepository;
import com.taxiDriver.Utilities.InvalidParamException;
import com.taxiDriver.Utilities.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    public CustomerDTO registerCustomer(CustomerDTO c) throws InvalidParamException, NotFoundException {
        Customer customer = new Customer(c.getName(), c.getLastName(), c.getEmail(), c.getPassword(), c.getDni());
        customerRepository.save(customer);
        return new CustomerDTO(customer);
    }

    public List<CustomerDTO> getAllCustomer() throws NotFoundException {
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        for (Customer customer : customerRepository.getAllCustomer()) {
            CustomerDTO customerDTO = new CustomerDTO(customer);
            customerDTOList.add(customerDTO);
        }
        return customerDTOList;
    }

    public List<CustomerDTO> deleteAllCustomers() throws NotFoundException {
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        for (Customer customer : customerRepository.getAllCustomer()) {
            CustomerDTO customerDTO = new CustomerDTO(customer);
            customerDTOList.add(customerDTO);
        }
        customerRepository.removeAllCustomers();
        return customerDTOList;
    }
}
