package Project20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyMatrix {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1[][] = new int[4][4];
        int num2[][] = new int[4][4];
        int num3[][] = new int[4][4];
        int x, y,z;
        System.out.print("Please , enter First Matrix");
        for (x=0;x<4;x++)
        {
            for (y=0;y<4; y++) {
                num1[x][y] = Integer.parseInt(br.readLine());
            }
        }
        for (x = 0; x < num1.length; x++)
        {
            for (y=0;y<4;y++)
            {
                System.out.print("" + num1[x][y]);
            }
            System.out.println();
        }
        //Pro 2
        System.out.println("Please, enter Second Matrix");
        for (x=0;x<4;x++)
        {
            for (y=0;y<4;y++) {
                num2[x][y] = Integer.parseInt(br.readLine());
            }
        }
        for (x=0;x<num2.length; x++)
        {
            for (y=0;y<4;y++)
            {
                System.out.print(" " + num2[x][y]);
            }
            System.out.println();
        }
        for (x=0;x<4;x++) {
            for (y=0;y<4;y++)
            {
               num3[x][y] = 0;
               for (z=0;z<4;z++)
               {
                num3[x][y] = num3[x][y] + (num1[x][z]*num2[z][y]);
               }
            }
        }
        System.out.println("The Result of your Multiplication is: ");
        for (x=0;x<4;x++)
        {
            for (y=0;y<4;y++)
            {
                System.out.print(" " + num3[x][y]);
            }
            System.out.println();
        }

    }
}
