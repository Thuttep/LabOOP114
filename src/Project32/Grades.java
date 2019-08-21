package proj32;

import java.util.Scanner;

public class Grades {
    public static void main(String args[]){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("please,enter your score:");

        x = sc.nextInt();
        if (x>0&&x<=40){
            System.out.println("your failed");
        }
        else if (x>40&&x<70){
            System.out.println("your passed");
        }
        else if (x>=70){
            System.out.println("Excellent");
        }
        else if (x<0){
            System.out.println("Only positve numbers are allowed");
        }
        else {
            System.out.println("Please insert valid numbers");
        }
    }
}
