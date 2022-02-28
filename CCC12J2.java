import java.util.*;
public class CCC12J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		if(a > b && b > c && c > d) {
			System.out.println("Fish Diving");
		}
		else if(a < b && b < c && c < d) {
			System.out.println("Fish Rising");
		}
		else if(a == b && b == c && c == d) {
			System.out.println("Fish At Constant Depth");
		}
		else {
			System.out.println("No Fish");
		}

	}

}