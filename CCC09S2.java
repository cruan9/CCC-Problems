import java.util.*;
import java.io.*;
public class CCC09S2 {	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int R = readInt(), L = readInt();
		HashSet<String> set[] = new HashSet[R];
		String p[] = new String[R];
		for(int i = 0; i < R; i++) {
			p[i] = "";
			set[i] = new HashSet<String>();
			for(int j = 0; j < L; j++) {
				String x = next(); p[i] +=x;
			}
		}
		for(int i = 0; i < R; i++) {
			set[i].add(p[i]);
			if(i > 0) {
				for(String k : set[i-1]) {
					set[i].add(xor(k, p[i]));
				}
			}
		}
		System.out.println(set[R-1].size());
	}
	public static String xor(String a, String b) {
		String ret = "";
		for(int i = 0; i < a.length(); i++) {
			ret += a.charAt(i) == b.charAt(i) ? '0' : '1';
		}
		return ret;
	}
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