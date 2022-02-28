import java.io.*;
import java.util.*;

public class CCC16J1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int win = 0;
        int loss = 0;
        for(int i = 0; i < 6; i++){
            String x = in.nextLine();
            if(x.equals("W")){
                win++;
            }
            else if(x.equals("L")){
                loss++;
            }
        }
        if(win == 0){
            System.out.println(-1);
        }
        else if(win >= 5){
            System.out.println(1);
        }
        else if(win >= 3){
            System.out.println(2);
        }
        else{
            System.out.println(3);
        }
    }
}