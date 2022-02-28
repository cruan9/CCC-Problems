import java.io.*;
import java.util.*;

public class CCC19J2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 0; i < N; i++){
            int x = in.nextInt();
            String st = in.next();
            for(int j = 0; j < x; j++) System.out.print(st);
            System.out.println("");
        }
    }
}