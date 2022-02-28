import java.util.*;
import java.io.*;
public class CCC09S4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt(), T = readInt(), dis[] = new int[N+1];
		boolean vis[] = new boolean[N+1];
		int[][] adj = new int[N+1][N+1];
		for(int i = 0; i < T; i++) {
			int x = readInt(), y = readInt(), w = readInt();
			adj[x][y] = w; adj[y][x] = w;
		}
		for(int i = 1; i <= N; i++) dis[i] = Integer.MAX_VALUE;
		int K = readInt();
		int[] price = new int[N+1];
		for(int i = 0; i < K; i++) {
			int x = readInt(), y = readInt();
			price[x] = y;
		}
		PriorityQueue<E> Q = new PriorityQueue<E>();
		int B = readInt(); dis[B] = 0; Q.add(new E(B, 0));
		for(int i = 0; i < N; i++) {
			int min = Integer.MAX_VALUE, index = -1;
			for(int j = 1; j <= N; j++) {
				if(min > dis[j] && !vis[j]) { min = dis[j]; index = j; }
			}
			vis[index] = true;
			for(int j = 1; j <= N; j++) {
				if(adj[index][j] != 0 && !vis[j] && dis[j] > dis[index] + adj[index][j]) {
					 dis[j] = dis[index] + adj[index][j];
				}
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i = 1; i <= N; i++) {
			if(price[i] != 0 && dis[i] + price[i] < min) {
                min = dis[i]+price[i];
            }
		}
		System.out.println(min);
	}
    static class E implements Comparable<E> {
        public int x, y;
        public E(int x0, int y0) {x = x0; y = y0;}
        public int compareTo(E x) {
            return Integer.compare(x.y, y);
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