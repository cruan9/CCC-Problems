import java.io.*;
import java.util.*;

public class CCC14J1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a+b+c != 180){
            System.out.println("Error");
        }
        else if(a == b && b == c){
            System.out.println("Equilateral");
        }
        else if(a == b || b == c || a == c){
            System.out.println("Isosceles");
        }
        else{
            System.out.println("Scalene");
        }
    }
}
