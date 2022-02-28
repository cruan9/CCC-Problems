import java.io.*;
import java.util.*;

public class CCC19S4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int MM = (int) (1e6+3);
		int N = readInt(), K = readInt(), a[] = new int[MM], pmx[] = new int[MM], smx[] = new int[MM], day[] = new int[MM];
		long dp[] = new long[MM], t1[] = new long[MM], t2[] = new long[MM];
		for(int i = 1; i <= N; i++) {
			int x = readInt();
			a[i] = x; day[i] = (i+K-1)/K;
			if(day[i] != day[i-1]) pmx[i] = a[i];
			else pmx[i] = Math.max(pmx[i-1], a[i]);
		}
		for(int i = N; i >= 1; i--) {
			if(day[i] != day[i+1]) smx[i] = a[i];
			else smx[i] = Math.max(smx[i+1], a[i]);
		}
		for(int i = 1; i <= K; i++) dp[i] = pmx[i];
		for(int i = 2; i <= day[N]; i++) {
			int fst = (i-2)*K+1, lst = (i-1)*K;
			for(int j = lst; j >= fst; j--) {
				if(j != lst) t1[j] = (dp[j] + smx[j+1]);
				else t1[j] = dp[j];
				t2[j] = dp[j];
				if(j != lst) {
					t1[j] = Math.max(t1[j+1], t1[j]);
					t2[j] = Math.max(t2[j+1], t2[j]);
				}
			}
			for(int j = lst+1; j <= Math.min(i*K, N); j++) {
				dp[j] = Math.max(t1[j-K], t2[j-K] + pmx[j]);
			}
		}
		System.out.println(dp[N]);
	}
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
	static long readLong () throws IOException {
		return Long.parseLong(next());
	}
	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}