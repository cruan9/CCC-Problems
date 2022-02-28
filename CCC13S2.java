import java.util.*;
public class CCC13S2 {
	static int[] we;
	static Queue<Integer> Q;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int W = in.nextInt(), N = in.nextInt(), cnt = 0; we = new int[4];
		Q = new LinkedList<Integer>();
		for(int i = 0; i < N; i++) {
			int x = in.nextInt();
			if(i < we.length) we[3-i] = x;
			else Q.add(x);
		}
		if(N <= 4) {
			int sum = 0;
			for(int i = 0; i < N; i++) sum += we[i]; 
			if(sum > W) System.out.println(0);
			else System.out.println(N);
		}
		else {
			for(int j = 0; j < N-3; j++) {
				if(sum() > W) {
					int sum = 0; 
					for(int i = we.length-1; i >= 0; i--) {
						sum += we[i]; 
						if(sum > W) break;
						cnt++;
					} break; 
				}
				if(j == N-4 && sum() <= W) { cnt = N-3; break; }
				move(); cnt++;
			}
			if(sum() <= W) cnt += 3;
			System.out.println(cnt);
		}
	}
	public static int sum() {
		int s = 0;
		for(int i = 0; i < we.length; i++) s += we[i];
		return s;
	}
	public static void move() {
		for(int i = we.length-1; i > 0; i--) {
			we[i] = we[i-1];
		}
		int cur = Q.poll(); we[0] = cur;
	}

}