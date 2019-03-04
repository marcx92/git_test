package com.taxiDriver.Persistence;

import com.taxiDriver.Domain.Driver;
import org.springframework.data.repository.CrudRepository;

interface HelperDriverRepository extends CrudRepository<Driver,Integer> {

    boolean existsByEmail(String email);
}

