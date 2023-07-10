package org.example.exceptions;

import java.io.IOException;

public class IncorrectDataInputException extends IOException {

    public IncorrectDataInputException(String msg, Exception e) {
        super("Mismatch of the data" + msg, e);
    }
    public IncorrectDataInputException(String msg) {
        super("Mismatch of the data... " + msg);
    }
}
