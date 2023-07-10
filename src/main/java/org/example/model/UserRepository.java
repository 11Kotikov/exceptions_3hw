package org.example.model;

import java.io.FileWriter;
import java.io.IOException;

public class UserRepository {

    public static void makeNewUser () {

    }
    public void writeData(StringBuilder path, String[] toWrite) throws IOException {
        String pathToFile = String.valueOf(path);
        try (FileWriter writer = new FileWriter(pathToFile, true)) {
            for (String line : toWrite) {
                writer.write("<");
                writer.write(line);
                writer.write(">");
            }
            writer.write("\n");
        }
    }
}
