import java.io.*;
import java.util.*;

public class CCC19J3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 0; i < N; i++){
            String s = in.next();
            int sum = 1;
            char c = s.charAt(0);
            for(int j = 1; j < s.length(); j++){
                if(c == s.charAt(j)) sum++;
                else {
                    System.out.print(sum + " " + c + " ");
                    sum = 1; c = s.charAt(j);
                }
            }
            System.out.println(sum + " " + c);
        }
    }
}