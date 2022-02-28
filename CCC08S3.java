import java.io.*;
import java.util.*;
public class CCC08S3 {
	public static void main(String[] args) throws IOException {
        int n = readInt();
        for(int t = 0; t < n; t++) {
        	int x = readInt(); int y = readInt();
        	int[][] adj = new int[x+2][y+2];
            for(int i = 1; i <= x; i++) {
                Arrays.fill(adj[i], -1);
                String s = readLine();
                for(int j = 1; j <= y; j++) {
                    String str = s.substring(j-1, j);
                    if(str.equals("-")) adj[i][j] = 0;
                    else if(str.equals("|")) adj[i][j] = 1;
                    else if(str.equals("+")) adj[i][j] = 2;
                    else adj[i][j] = -1;
                }
            }
            int[][] dis = new int[x+2][y+2];
            Queue<E> Q = new LinkedList<>();
            Q.add(new E(1, 1)); dis[1][1] = 1;
            while(!Q.isEmpty()) {
                E cur = Q.poll();
                int i = cur.x; int j = cur.y;
                if(i > 0 && i < x+1 && j > 0 && j < y+1) {
                    if(dis[i+1][j] == 0 && (adj[i][j] == 1 || adj[i][j] == 2) && adj[i+1][j] != -1) {
                        dis[i+1][j] = dis[i][j] + 1;
                        Q.add(new E(i+1, j));
                    }
                    if(dis[i-1][j] == 0 && (adj[i][j] == 1 || adj[i][j] == 2) && adj[i-1][j] != -1) {
                        dis[i-1][j] = dis[i][j] + 1;
                        Q.add(new E(i-1, j));
                    }
                    if(dis[i][j+1] == 0 && (adj[i][j] == 0 || adj[i][j] == 2) && adj[i][j+1] != -1) {
                        dis[i][j+1] = dis[i][j] + 1;
                        Q.add(new E(i, j+1));
                    }
                    if(dis[i][j-1] == 0 && (adj[i][j] == 0 || adj[i][j] == 2) && adj[i][j-1] != -1) {
                        dis[i][j-1] = dis[i][j] + 1;
                        Q.add(new E(i, j-1));
                    }
                }
                if(dis[x][y] != 0) break;
            }

            if(dis[x][y] != 0) System.out.println(dis[x][y]);
            else System.out.println(-1);
        }
    }

    static class E {
        public int x, y;
        E(int x0, int y0) {x = x0; y = y0;}
    }
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
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
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}