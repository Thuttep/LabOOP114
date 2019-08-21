package proj43;

import java.util.Scanner;

public class Arrays {
    public static void main(String args[]){
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert any element of your choice:");

        x = sc.nextInt();
        int num1[]=new int[x+1];
        System.out.println("Please,insert arrays of elements now:");
        for (int w=0; w<x; w++){
            num1[w]=sc.nextInt();
        }
        System.out.println("Choose a prefered positon for your element:");
        y=sc.nextInt();
        System.out.println("Insert yor prefered element:");
        z = sc.nextInt();
        for (int w=(x-1); w>(y-1); w--){
            num1[w+1]=num1[w];
        }
        num1[y-1]=z;
        System.out.println("The result after inserting element is:");
        for (int w=0; w<x; w++){
            System.out.println(num1[w]+",");
        }
        System.out.println(num1[x]);
    }
}
