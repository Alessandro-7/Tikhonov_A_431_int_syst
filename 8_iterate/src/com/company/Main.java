package com.company;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        double a =   25214903917L;
        double c = 11L;
        double m = Math.pow(2,48);
        double x0 = 0;
        Stream<Double> numbers = Stream.iterate(x0, x  -> (a * x + c) % m)
                .limit(10);

        numbers.forEach(System.out::println);
    }
}
