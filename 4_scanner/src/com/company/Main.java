package com.company;
import java.util.Scanner;
import java.util.function.IntSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Supplier<String> inWord = ()->{

            Scanner in = new Scanner(System.in);
            String input = in.next();
            return new String(input);
        };

        Supplier<String> inString = ()->{

            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            return new String(input);
        };

        IntSupplier inInt = ()->{

            Scanner in = new Scanner(System.in);
            int input = in.nextInt();
            return input;
        };

         DoubleSupplier inDouble = ()->{

            Scanner in = new Scanner(System.in);
            double input = in.nextDouble();
            return input;
        };



    }


}
