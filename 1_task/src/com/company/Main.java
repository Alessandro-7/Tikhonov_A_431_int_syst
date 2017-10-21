package com.company;


public class Main {
    public static int swap(int a, int b){
        return a;
    }
    public  static int rem(int a, int b){
        return Math.abs(a%b);
    }

    public static int gcd(int a, int b){
        if (Math.abs(a) < Math.abs(b))
            b = swap(a, a=b);


            while (a != 0){
                //a = Math.floorMod(b, b = a);
                a = rem(b, b = a);
                //a = b % (b = a);
            }
        return b;
    }


    public static void main(String[] args) {
        int ans = gcd(-15,-3);
        System.out.println(ans);
    }
}
