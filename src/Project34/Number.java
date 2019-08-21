package proj34;


import java.util.Scanner;

public class Number {
    public static void main(String args[]){
        int x;
        System.out.println("Please insert any number:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        if (x % 2==0)
            System.out.println("This is even number");
        else
            System.out.println("This is odd number");
    }
}
