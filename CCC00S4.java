import java.util.*;
public class CCC00S4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int M = in.nextInt(), N = in.nextInt();
		int a[] = new int[N];
		for(int i = 0; i < N; i++) a[i] = in.nextInt();
		int dp[] = new int[5281];
		boolean vis[] = new boolean[5281];
		vis[0] = true;
		for(int i = 1; i <= M; i++) {
			for(int j = 0; j < N; j++) {
				if(i-a[j] >= 0) {
					if(dp[i] == 0 && vis[i-a[j]]) {
						dp[i] = dp[i-a[j]] + 1; vis[i] = true;
					}
					else if(vis[i-a[j]]){
						dp[i] = Math.min(dp[i], dp[i-a[j]]+1);
						vis[i] = true;
					}
				}
			}
		}
		if(dp[M] == 0) System.out.println("Roberta acknowledges defeat.");
		else System.out.println("Roberta wins in " + dp[M] +  " strokes.");
	}

}