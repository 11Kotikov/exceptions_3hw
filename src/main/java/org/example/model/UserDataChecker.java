package org.example.model;

import org.example.exceptions.DataFormatException;
import org.example.exceptions.IncorrectDataInputException;

public class UserDataChecker {
    public void DataLengthChecker(String[] userInputData) throws IncorrectDataInputException {
        int dataLength = 6;
        if (userInputData.length < dataLength) {
            throw new IncorrectDataInputException("You missed something, six elements are expected");
        } else if (userInputData.length > dataLength) {
            throw new IncorrectDataInputException("Too much data, six elements are expected");
        }
    }

    public void DataFormatChecker(String dateBirth, String phoneNumber, String sex) throws DataFormatException {
        if (!dateBirth.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new DataFormatException("Date format error: dd.mm.yyyy is expected");
        }
        if (!phoneNumber.matches("\\d+")) {
            throw new DataFormatException("Phone format error: one-line integer number is expected");
        }
        if (!sex.matches("[mf]")) {
            throw new DataFormatException("Gender format error: 'm' or 'f' is expected");
        }
    }

}
