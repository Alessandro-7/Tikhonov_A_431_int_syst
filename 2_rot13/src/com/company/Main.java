package com.company;

public class Main {

    public static void main(String[] args) {
        String al = "NOPQRSTUVWXYZABCDEFGHIJKLM[\\]^_`nopqrstuvwxyzabcdefghijklm";
	    String in = args[0];
	    String out = "";
        for (int i = 0; i < in.length(); ++i) {
            out += String.valueOf(al.charAt((int) in.charAt(i) - 65));
            
        }
        System.out.println(out);
    }

}
