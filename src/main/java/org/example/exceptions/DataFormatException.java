package org.example.exceptions;

import java.io.IOException;

public class DataFormatException extends IOException {
    public DataFormatException (String msg) {
        super (msg);
    }
}
