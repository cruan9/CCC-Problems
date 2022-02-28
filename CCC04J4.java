import java.io.*;
import java.util.*;

public class CCC04J4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String k = in.nextLine(), s = in.nextLine();
        for(int i = 0, j = 0; i < s.length(); i++, j++){
            if(j % k.length() == 0) j = 0;
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                if((s.charAt(i) + k.charAt(j)-65 > 90)){
                    System.out.print((char)(s.charAt(i)+k.charAt(j)-26-65));
                }
                else{
                    System.out.print((char)(s.charAt(i)+k.charAt(j)-65));
                }
            }
            else{
                j--;
            }
        }
    }
}