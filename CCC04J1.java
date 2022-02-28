import java.util.*;
public class CCC04J1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int s = (int) Math.floor(Math.sqrt(n));
    System.out.println("The largest square has side length " + s + ".");
  }
}