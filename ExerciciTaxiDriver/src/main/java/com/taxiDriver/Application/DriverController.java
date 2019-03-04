package com.taxiDriver.Application;

import com.taxiDriver.Application.DTO.DriverDTO;
import com.taxiDriver.Domain.Driver;
import com.taxiDriver.Persistence.DriverRepository;
import com.taxiDriver.Utilities.InvalidParamException;
import com.taxiDriver.Utilities.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DriverController {

    @Autowired
    DriverRepository driverRepository;

    public DriverDTO registerDriver(DriverDTO d) throws InvalidParamException, NotFoundException {
        Driver driver = new Driver(d.getName(), d.getLastName(), d.getEmail(), d.getPassword(), d.getDriverId());
        driverRepository.save(driver);
        return new DriverDTO(driver);
    }

    public List<DriverDTO> getAllDrivers() throws NotFoundException {
        List<DriverDTO> driverDTOList = new ArrayList<>();
        for (Driver driver : driverRepository.getAllDrivers()) {
            DriverDTO driverDTO = new DriverDTO(driver);
            driverDTOList.add(driverDTO);
        }
        return driverDTOList;
    }

    public List<DriverDTO> deleteAllDrivers() throws NotFoundException {
        List<DriverDTO> driverDTOList = new ArrayList<>();
        for (Driver driver : driverRepository.getAllDrivers()) {
            DriverDTO driverDTO = new DriverDTO(driver);
            driverDTOList.add(driverDTO);
        }
        driverRepository.removeAllDrivers();
        return driverDTOList;
    }
}
