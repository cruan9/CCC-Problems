import java.util.*;
public class CCC11J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		int t = 0;
		while(true) {
			 if(((-6*t*t*t*t)+(h*t*t*t)+(2*t*t)+t) < 0) {
				System.out.println("The balloon first touches ground at hour: \n" + t);
				break;
			}
			else if(t >= m){
				System.out.println("The balloon does not touch ground in the given time.");
				break;
			}
			t++;
		}
	}

}