import java.io.*;
import java.util.*;
public class CCC13S4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
    public static ArrayList<Integer>[] adj;
    public static int n;
    public static boolean bfs(int s, int e) {
        Queue<Integer> Q = new LinkedList<Integer>();
        boolean[] vis = new boolean[n+1];
        Q.add(s); vis[s] = true;
        while(!Q.isEmpty()) {
            int cur = Q.poll();
            for(int u: adj[cur]) {
                if(!vis[u]) {
                    vis[u] = true;
                    Q.add(u);
                }
            }
            if(vis[e]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        n = readInt();
        int m = readInt();
        adj = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++) {
            int a = readInt();
            int b = readInt();
            adj[a].add(b);
        }
        int x = readInt(); 
        int y = readInt();
        if(bfs(x, y)) System.out.println("yes");
        else if(bfs(y,x)) System.out.println("no");
        else System.out.println("unknown");
    }
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}

}