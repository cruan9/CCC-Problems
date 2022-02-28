import java.util.*;
public class CCC05J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int rsa = 0;
		for(int i = x; i <= y; i ++) {
			int temp = 0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					temp++;
				}
			}
			if(temp == 2) {
				rsa++;
			}
		}
		System.out.println("The number of RSA numbers between " +  x + " and " + y + " is " + rsa);
	}

}