package com.taxiDriver.API;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.taxiDriver.Application.CustomerController;
import com.taxiDriver.Application.DTO.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.taxiDriver.Utilities.InvalidParamException;
import com.taxiDriver.Utilities.NotFoundException;
import java.util.List;

@CrossOrigin
@RestController
public class CustomerRestController {

    @Autowired
    private CustomerController controller;

    private String toJson(Object object){

        Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        return gson.toJson(object);
    }

    @PostMapping(value = "/users/customers", produces = "application/json;charset=UTF-8")
    public String register(@RequestBody String jCustomer) throws InvalidParamException, NotFoundException {

        CustomerDTO newCustomer = new Gson().fromJson(jCustomer, CustomerDTO.class);

        CustomerDTO customer = controller.registerCustomer(newCustomer);

        return toJson(customer);
    }

    @GetMapping(value = "/users/customers", produces = "application/json;charset=UTF-8")
    public String listCustomers() throws NotFoundException {

        List<CustomerDTO> customers = controller.getAllCustomer();

        return toJson(customers);
    }
}
