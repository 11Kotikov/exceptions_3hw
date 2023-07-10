package org.example.model;

import java.util.Scanner;

public class UserData {
    public String [] getData() {
        String[] userDataArray;
        try (Scanner input = new Scanner(System.in);) {
            String userData = input.nextLine();
            userDataArray = userData.split(" ");
        }
        return userDataArray;
    }
}
