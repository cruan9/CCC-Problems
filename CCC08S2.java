import java.util.*;
import java.io.*;
public class CCC08S2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		while(true) {
			int x = readInt();
			if(x == 0) break;
			System.out.println(pennies(x));
		}
	}
	static int pennies(int p){
		int total = 0;
		for(int i = 1; i <= p; i++){
			for(int j = 0; j <= p; j++){
				if(i * i + j * j <= p * p) total++;
				else break;
			}
		}
		return 1 + 4 * total;
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