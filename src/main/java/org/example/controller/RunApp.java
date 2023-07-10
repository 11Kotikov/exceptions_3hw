package org.example.controller;

public class RunApp {
    public void runApp () {
        try {
            UserRegistrationController runApp = new UserRegistrationController();
            runApp.newUserRegistration();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
