import java.util.*;
public class CCC05J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		double planA;
		double planB;
		if(x>100) {
			planA =  (x-100)*25+(15*y)+(20*z);
			planA += 0.00;
			planA /= 100;
			System.out.println("Plan A costs " + planA);
		}
		else {
			planA = (15*y)+(20*z);
			planA += 0.00;
			planA /= 100;
			System.out.println("Plan A costs " + planA);
		}
		if(x > 250) {
			planB = (x-250)*45+(35*y)+(25*z);
			planB += 0.00;
			planB /= 100;
			System.out.println("Plan B costs " + planB);
		}
		else {
			planB = (35*y)+(25*z);
			planB += 0.00;
			planB /= 100;
			System.out.println("Plan B costs " + planB);
		}
		if(planB < planA) {
			System.out.println("Plan B is cheapest.");
		}
		else if(planA < planB) {
			System.out.println("Plan A is cheapest.");
		}
		else {
			System.out.println("Plan A and B are the same price.");
		}
	}

}