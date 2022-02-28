import java.io.*;
import java.util.*;

public class CCC19J1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(), e = in.nextInt(), f = in.nextInt();
        int score1 = 3*a+2*b+c;
        int score2 = 3*d+2*e+f;
        if(score1 > score2) System.out.println("A");
        else if(score2 > score1) System.out.println("B");
        else System.out.println("T");
    }
}