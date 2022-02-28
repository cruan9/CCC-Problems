import java.io.*;
import java.util.*;

public class CCC17J2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), k = in.nextInt(), sum = N;
        for(int i = 1; i <= k; i++){
            sum += Math.pow(10,i) * N;
        }
        System.out.println(sum);
    }
}