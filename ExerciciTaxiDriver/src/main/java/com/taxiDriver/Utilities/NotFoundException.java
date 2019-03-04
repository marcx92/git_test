package com.taxiDriver.Utilities;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="El paràmetre introduït no existeix la base de dades.")
public class NotFoundException extends Exception {

    public NotFoundException(String msg) {
        super(msg);
    }

    public NotFoundException() {
        super();
    }

}
