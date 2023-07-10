package org.example.controller;

import org.example.exceptions.DataFormatException;
import org.example.exceptions.IncorrectDataInputException;
import org.example.model.Users;
import org.example.model.UserData;
import org.example.model.UserDataChecker;
import org.example.model.UserRepository;

import java.io.IOException;

import static org.example.util.NameMyFile.nameMyFile;

public class UserRegistrationController {
    UserData userInputData = new UserData();
    Users newUser;
    String[] userSavedData;
    UserDataChecker dataChecker = new UserDataChecker();
    UserRepository addUser = new UserRepository();
    public void newUserRegistration() throws IncorrectDataInputException, DataFormatException {
        System.out.println("For registration, please input valid values in that order: Surname, Name, Middle Name," +
                " birth date (format: dd.mm.yyyy), Phone Number (format: only integers one-line e.g. 1234556788)," +
                "gender (format: 'm' or 'f') ");
        userSavedData = userInputData.getData();
        dataChecker.DataLengthChecker(userSavedData);
        newUser = new Users(userSavedData[0], userSavedData[1], userSavedData[2],
                userSavedData[3], userSavedData[4], userSavedData[5]);
        dataChecker.DataFormatChecker(newUser.getDateOfBirth(), newUser.getPhoneNumber(), newUser.getSex());
        try {
            addUser.writeData(nameMyFile(newUser.getSurname()), newUser.makeNewUser());
            System.out.println("the data has been successfully saved");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
