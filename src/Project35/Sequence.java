package proj35;

public class Sequence {
    public static void main(String args[]){
        int w = 0,x=1,y,z, count=10;
        System.out.println("The result of Fibonacci Sequence is:");
        System.out.println(w+" "+x);

        for (z=2;z<count;z++){
            y=w+x;
            System.out.println(" "+y);
            w=x;
            x=y;
        }
    }
}
