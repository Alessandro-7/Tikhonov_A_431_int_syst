package com.company;
import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args)  {
        try {
            Files.walk(Paths.get("C://Program Files//Java//jdk-9.0.1//lib//unzipped"))
                    .filter(p -> p.toString().contains("Transient") || p.toString().contains("Volatile"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
