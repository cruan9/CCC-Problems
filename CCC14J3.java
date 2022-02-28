import java.io.*;
import java.util.*;

public class CCC14J3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = 100, b = 100;
        for(int i = 0; i < N; i++){
            int x = in.nextInt(), y = in.nextInt();
            if(x > y) b -= x;
            else if(y > x) a -= y;
        }
        System.out.println(a);
        System.out.println(b);
    }
}