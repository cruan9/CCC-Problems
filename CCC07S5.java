import java.util.*;
import java.io.*;
public class CCC07S5 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
    public static void main(String [] args) throws IOException{
    	int T = readInt();
    	for(int t=1; t<=T; t++){
    		int n = readInt(), k = readInt(), w = readInt(), dp[][]=new int[k+1][n+1], psa[]=new int[n+1];
    		for(int i=1; i<=n; i++)
    			psa[i] = psa[i-1] + readInt(); 
    		for(int i=1; i<=k; i++){
    			for(int j=1; j<=n; j++){
    				if(j <= w) dp[i][j] = psa[j];
    				else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j-w] + psa[j] - psa[j-w]);
    			}
    		}
    		pr.println(dp[k][n]);
    	}
    	pr.close();
    }
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong () throws IOException {
		return Long.parseLong(next());
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}