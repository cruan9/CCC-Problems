import java.util.*;
import java.io.*;

public class CCC06S1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String mom = readLine(), dad = readLine();
		int x = readInt();
		String babies[] = new String[x];
		boolean possible[] = new boolean[x];
		for(int i = 0; i < x; i++) {
			babies[i] = readLine();
			possible[i] = true;
		}
		int j = 0;
		for(int i = 0; i < x; i++) {
			int type = 0; //capital: 1, lower case: 2, any: 3
			boolean lowermom = false;
			boolean lowerdad = false;
			boolean uppermom = false;
			boolean upperdad = false;
			if(((int)mom.charAt(j) >= 97 && (int)mom.charAt(j) <= 101) || ((int)mom.charAt(j+1) >= 97 && (int)mom.charAt(j+1) <= 101)) {
				lowermom = true;
			}
			if(((int)mom.charAt(j) >= 65 && (int)mom.charAt(j) <= 69) || ((int)mom.charAt(j+1) >= 65 && (int)mom.charAt(j+1) <= 69)) {
				uppermom = true;
			}
			if(((int)dad.charAt(j) >= 97 && (int)dad.charAt(j) <= 101) || ((int)dad.charAt(j+1) >= 97 && (int)dad.charAt(j+1) <= 101)) {
				lowerdad = true;
			}
			if(((int)dad.charAt(j) >= 65 && (int)dad.charAt(j) <= 69) || ((int)dad.charAt(j+1) >= 65 && (int)dad.charAt(j+1) <= 69)) {
				upperdad = true;
			}
			if(lowerdad && lowermom && (uppermom || upperdad)) type = 3;
			else if(lowerdad && lowermom && !uppermom && !upperdad) type = 2;
			else if(!lowerdad || !lowermom) type = 1;
			for(int k = 0; k < babies.length; k++) {
				char c = babies[k].charAt(i);
				int t = 0;
				if((int)c >= 65 && c <= 69) t = 1;
				else if((int)c >= 97 && (int)c <= 101) t = 2;
				if(type == 3) { }
				else if(t != type) {
					possible[k] = false;
				}	
			}
			j += 2;
		}
		for(int i = 0; i < possible.length; i++) {
			if(!possible[i]) System.out.println("Not their baby!");
			else System.out.println("Possible baby.");
		}
		
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