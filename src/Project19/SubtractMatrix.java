package Project18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubtractMatrix {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1[][] = new int[3][3];
        int num2[][] = new int[3][3];
        int num3[][] = new int[3][3];
        int x, y;
        System.out.print("Please insert First Matrix");
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                num1[x][y] = Integer.parseInt(br.readLine());
            }
        }
        for (x = 0; x < num1.length; x++) {
            for (y = 0; y < 3; y++)
            {
                System.out.print("" + num1[x][y]);
            }
            System.out.println();
        }
        //2
        System.out.println("Please insert Second Matrix");
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                num2[x][y] = Integer.parseInt(br.readLine());
            }
    }
        for (x = 0; x<num2.length; x++)
        {
            for (y = 0; y<3; y++)
            {
                System.out.print(" " + num2[x][y]);
            }
            System.out.println();
        }
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                num3[x][y] = num1[x][y] * num2[x][y];
            }
        }
        System.out.println("Result of Subtraction is: ");
        for (x=0;x<3;x++)
        {
            for (y=0;y<3;y++)
            {
                System.out.print(" " + num3[x][y]);
            }
            System.out.println();
        }

    }
}
