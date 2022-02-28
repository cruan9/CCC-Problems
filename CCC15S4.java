import java.util.*;
import java.io.*;
public class CCC15S4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
        int K = readInt(), N = readInt(), M = readInt();
        ArrayList<E>[] adj = new ArrayList[N+1];
        for(int i = 1; i <= N; i++) adj[i] = new ArrayList<E>();
        for(int i = 1; i <= M; i++) {
            int a = readInt(), b = readInt(), c = readInt(), d = readInt();
            adj[a].add(new E(b, c, d)); adj[b].add(new E(a, c, d));
        }
        int A = readInt(), B = readInt();
        long[][] dis = new long[N+1][K+1];
        for(int i = 1; i <= N; i++) {
        	for(int j = 0; j <= K; j++) {
        		dis[i][j] = Integer.MAX_VALUE;
        	}
        }
        for(int i = 1; i <= K; i++) dis[A][i] = 0;
        boolean[] vis = new boolean[N+1];
        Queue<Integer> Q = new LinkedList<>();
        Q.add(A);
        while(!Q.isEmpty()) {
            int cur = Q.poll();
            vis[cur] = false;
            for(E x: adj[cur]) {
                for(int i = 1; i <= K-x.z; i++) {
                    if(dis[x.x][i+x.z] > dis[cur][i] + x.y) {
                        dis[x.x][i+x.z] = dis[cur][i] + x.y;
                        if(!vis[x.x]) {
                            Q.add(x.x);
                            vis[x.x] = true;
                        }
                    }
                }
            }
        }
        if(dis[B][K] == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(dis[B][K]);
    }

    static class E {
        public int x, y, z;
        E(int x0, int y0, int z0) {x = x0; y = y0; z = z0;}
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