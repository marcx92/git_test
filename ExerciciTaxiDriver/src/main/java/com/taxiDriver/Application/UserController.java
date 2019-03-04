package com.taxiDriver.Application;

import com.taxiDriver.Application.DTO.CustomerDTO;
import com.taxiDriver.Application.DTO.DriverDTO;
import com.taxiDriver.Application.DTO.UserDTO;
import com.taxiDriver.Utilities.InvalidParamException;
import com.taxiDriver.Utilities.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    DriverController driverController;

    @Autowired
    CustomerController customerController;

    public List<UserDTO> getAllUsers() throws NotFoundException, InvalidParamException {
        List<UserDTO> userDTOList = new ArrayList<>();
        for (CustomerDTO customer : customerController.getAllCustomer()) {
            UserDTO user = new UserDTO(customer);
            userDTOList.add(user);
        }
        for (DriverDTO driver : driverController.getAllDrivers()) {
            UserDTO user = new UserDTO(driver);
            userDTOList.add(user);
        }
        return userDTOList;
    }

    public void deleteAllUsers() throws NotFoundException {
        customerController.deleteAllCustomers();
        driverController.deleteAllDrivers();
    }
}
