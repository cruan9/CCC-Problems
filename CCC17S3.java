import java.io.*;
import java.util.*;
public class CCC17S3 {
	public static void main(String[] args) throws IOException{
		long N = readLong();
		long[] L = new long[2001];
		long max = 0;
		long max2 = 0;
		for(int i = 0; i < N; i++) {
			int x = readInt();
			L[x]++;
			if(x >= max) {
				max2 = max;
				max = x;
			}
		}
		if(max2 == 0) max2 = max;
		long x = max + max2;
		long arr[] = new long[(int) x+2];
		for(int i = 1; i <= x + 1; i++) {
            for (int j = 1; j <= i / 2; j++) {
                if(i - j <= max) {
                    if (L[j] != 0 && L[i - j] != 0) {
                        if (i % 2 == 0 && i / 2 == j) {
                            arr[i] += Math.floor(L[j] / 2);
                        } else {
                            arr[i] += Math.min(L[j], L[i - j]);
                        }
                    }
                }
            }
        }
		long y = 0;
		long num = 1;
		for(int i = 1; i <= x + 1; i++) {
            long z = arr[i];
            if(arr[i] != 0) {
                if (y < z) {
                    y = z;
                    num = 1;
                } else {
                    if(!(z < y)) num++;
                }
            }
        }
		System.out.println(y + " " + num);
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