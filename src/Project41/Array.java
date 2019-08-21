package proj41;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {
    public static void main(String args [])throws IOException{
        String st [] = new String[7];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please, insert string elements:");
        for (int x=0; x<7; x++){
            st[x] = br.readLine();
        }
        System.out.println("The result of the string values are:");{
            for (int x=0; x<7;x++){
                System.out.println(" "+st[x]);
            }
        }
    }
}
