package com.ciaranc.springit.exceptions;

public class SpringitException extends RuntimeException {
    public SpringitException(String errorMsg, Exception exception) {
        super(errorMsg, exception);
    }

    public SpringitException(String errorMsg){
        super(errorMsg);
    }
}
