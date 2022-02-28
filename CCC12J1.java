import java.util.*;
public class CCC12J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		if(x >= y) {
			System.out.println("Congratulations, you are within the speed limit!");
		}
		else if(y - x < 21) {
			System.out.println("You are speeding and your fine is $100.");
		}
		else if(y - x < 31) {
			System.out.println("You are speeding and your fine is $270.");
		}
		else {
			System.out.println("You are speeding and your fine is $500.");
		}
	}

}