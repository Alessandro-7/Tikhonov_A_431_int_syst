package com.company;


import java.io.IOException;
import java.nio.file.*;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String path = "C://Users//Александр//IdeaProjects//6_counter//in.txt";
        try (Stream<String> stream = Files.lines(Paths.get(path))) {

           OptionalInt sum = stream
                    .mapToInt(line -> {
                        char[] buf = new char[line.length()];
                        line.getChars(0,line.length(), buf, 0);
                        int count = 0;
                        for (char i : buf) {
                            if (i == args[0].charAt(0))
                                ++count;
                        }
                        return count;
                    })
                    .reduce((s1, s2) -> s1 + s2);
           System.out.println(sum.getAsInt());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
