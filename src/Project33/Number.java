package proj33;

import java.util.Scanner;

public class Number {
    public static void main(String args[]){
        int x;
        System.out.println("Please insert any number:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        if (x<0){
            System.out.println("This is negative number");
        }
        else
            System.out.println("This is positive number");
    }
}
