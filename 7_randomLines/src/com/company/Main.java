package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Random.*;

public class Main {

    public static void main(String[] args) {
        String path = "C://Users//Александр//IdeaProjects//7_randomLines//in.txt";
        //String path = args[0];
        int num = 3;
        //int num = args[1];
        List<String> list = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            list = stream
                    .collect(Collectors.toList());

        } catch (IOException e) {

        }
        for (int i =0; i < num; ++i) {
            System.out.println(list.get((int) (Math.random() * num)).toString());
        }



    }
}
