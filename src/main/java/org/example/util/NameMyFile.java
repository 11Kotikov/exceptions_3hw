package org.example.util;

public class NameMyFile {
    public static StringBuilder nameMyFile(String toName){
        StringBuilder fileNameBuilder = new StringBuilder();
        fileNameBuilder.append("C:\\Users\\PC\\Desktop\\GeekBrains\\ДЗ\\Exceptions" +
                        "\\exceptions_3hw\\src\\main\\java\\org\\example\\database\\")
                .append(toName)
                .append(".txt");
        return fileNameBuilder;
    }
}
