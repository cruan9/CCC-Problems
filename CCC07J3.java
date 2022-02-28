import java.io.*;
import java.util.*;

public class CCC07J3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 1691600;
        int a[] = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
        for(int i = 0; i < n; i++){
            int t = in.nextInt();
            sum -= a[t-1];
        }
        double avg = sum/(10-n);
        int off = in.nextInt();
        if(off > avg) System.out.println("deal");
        else System.out.println("no deal");
        
    }
}