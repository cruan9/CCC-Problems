import java.util.*;
public class CCC11J1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt(), e = in.nextInt();
    if(a >= 3 && e <= 4) System.out.println("TroyMartian");
    if(a <= 6 && e >= 2) System.out.println("VladSaturnian");
    if(a <= 2 && e <= 3) System.out.println("GraemeMercurian");
  }
}