import java.util.*;
public class CCC13S1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Y = sc.nextInt();
    boolean unique = false;
    while(!unique){
        unique = true;
        Y++;
        String Year = Integer.toString(Y);
        int[] digits = new int[10];
        for (int i=0; i<Year.length(); i++ ) {
           digits[Character.getNumericValue(Year.charAt(i))]++ ;
        }
        for (int i=0; i <= 9; i++) {
            if (digits[i]>=2) unique = false;
        }
}
  System.out.println(Y);
  }
}