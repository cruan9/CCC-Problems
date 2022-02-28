import java.util.*;
public class CCC06J1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(), s = 0;
    if(a == 1) s += 461;
    else if(a == 2) s += 431;
    else if(a == 3) s += 420;
    if(c == 1) s += 130;
    else if(c == 2) s += 160;
    else if(c == 3) s += 118;
    if(b == 1) s += 100;
    else if(b == 2) s += 57;
    else if(b == 3) s += 70;
    if(d == 1) s += 167;
    else if(d == 2) s += 266;
    else if(d == 3) s += 75;
    System.out.println("Your total Calorie count is " + s + ".");
  }

}