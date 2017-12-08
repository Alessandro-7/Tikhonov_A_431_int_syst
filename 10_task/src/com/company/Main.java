package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader (new FileReader("..\\10_task\\in.txt")))
        {
            int c;
            long hash = 0;
            long revHash = 0;
            int P_CONST = 2;
            int P = 1;
            String str = "";
            int length = 0;
            while((c=br.read())!=-1){
                str += String.valueOf((char) c);
                hash = hash + (c - (int)'a' + 1) * P;
                revHash = revHash * P_CONST + (c - (int)'a' + 1);
                System.out.print(str + " - ");
                if (revHash == hash)
                    System.out.print("Yes\n");
                else
                    System.out.print("No\n");
                P = P * P_CONST;

            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
