import java.io.*;
import java.util.*;

public class CCC15S1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        int K = in.nextInt();
        for(int i = 0; i < K; i++){
            int x = in.nextInt();
            if(x == 0) a.remove(a.size()-1);
            else a.add(x);
        }
        int sum = 0;
        for(int i = 0; i < a.size(); i++){
            sum += a.get(i);
        }
        System.out.println(sum);
    }
}