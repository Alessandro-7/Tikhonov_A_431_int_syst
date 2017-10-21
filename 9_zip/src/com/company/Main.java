package com.company;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import java.util.stream.*;

public class Main {


    public static<T> Stream<T> appendToStream(Stream<? extends T> stream, T element) {
        return Stream.concat(stream, Stream.of(element));
    }

    public static <T, U, R> Stream<T> zip (Stream<T> stream1, Stream<T> stream2, Stream<T> stream3) {
        Iterator<T> it1 = stream1.iterator();
        Iterator<T> it2 = stream2.iterator();

        return iter2(it1,it2,stream3);
    }

    public static <T, U, R> Stream<T> iter2 (Iterator<T> it1, Iterator<T> it2, Stream<T> stream3) {
        if (it1.hasNext() && it2.hasNext()) {


            iter2(it1,it2,plus(it1.next(), it2.next(), stream3));

        }
        return stream3;


    }
    public static <T, U, R> Stream<T> plus ( T ob1, T ob2, Stream<T> stream3) {

        Stream<T> stream4 = appendToStream(stream3, ob1);
        Stream<T> stream5 = appendToStream(stream4, ob2);
        stream5.forEach(System.out::println);
        return stream5;
    }




    public static void main(String[] args) {
        Stream<String> streamA = Stream.of("A", "B", "C", "D", "E");
        Stream<String> streamB  = Stream.of("Apple", "Banana", "Carrot", "Doughnut", "lol");
        Stream<String> streamC = Stream.of("h");
        zip(streamA,streamB,streamC);



    }


}
