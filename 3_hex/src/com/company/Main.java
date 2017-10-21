package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inHex = in.nextLine();
        Integer outDec = Integer.parseInt(inHex, 16);
        System.out.println(outDec);

    }
}
