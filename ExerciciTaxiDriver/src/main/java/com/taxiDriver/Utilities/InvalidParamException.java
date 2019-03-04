package com.taxiDriver.Utilities;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.CONFLICT, reason="El paràmetre introduït és incorrecte.")
public class InvalidParamException extends Exception {

    public InvalidParamException(String msg) {
        super(msg);
    }

    public InvalidParamException() {
        super();
    }

}