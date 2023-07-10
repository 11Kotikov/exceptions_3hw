package org.example.model;

public class Users {
    String surname;
    String firstName;
    String middleName;
    String dateOfBirth;
    String phoneNumber;
    String sex;

    public Users(String surname, String firstName, String middleName,
                 String dateOfBirth, String phoneNumber, String sex) {
        this.surname = surname;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    public String [] makeNewUser () {
        String [] newUser = new String[6];
        newUser[0] = this.surname;
        newUser[1] = this.firstName;
        newUser[2] = this.middleName;
        newUser[3] = this.dateOfBirth;
        newUser[4] = this.phoneNumber;
        newUser[5] = this.sex;
        return newUser;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
