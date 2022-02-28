import java.util.*;
public class CCC11J5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int counts[] = new int[N+1];
		counts[1] = 1;
		int invite[] = new int[N];
		for(int i = 1; i < N; i++) {
			int x = in.nextInt();
			invite[i] = x;
		}
		for(int i = 1; i <= N; i++) {
			int x = 1;
			for(int j = 0; j < invite.length; j++) {
				if(invite[j] == i) {
					x *= 1+counts[j];
				}
			}
			counts[i] = x;
		}

		System.out.println(counts[N]);

	}

}