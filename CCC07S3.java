import java.util.*;
public class CCC07S3 {
	static ArrayList<Integer>[] adj = new ArrayList[10000];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 1; i <= 9999; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			adj[a].add(b);
		}
		int x = in.nextInt();
		int y = in.nextInt();
		while(x != 0 && y != 0) {
			int dis = bfs(x,y);
			if(dis == -1) System.out.println("No");
			else System.out.println("Yes " + dis);
			x = in.nextInt(); y = in.nextInt();
		}
	}
	public static int bfs(int start, int end) {
		Queue<Integer> Q = new LinkedList<Integer>();
		boolean vis[] = new boolean[10000];
		int dis[] = new int[10000];
		Arrays.fill(dis, -1);
		Q.add(start); vis[start] = true;
		while(!Q.isEmpty()) {
			int cur = Q.poll();
			for(int v : adj[cur]) {
				if(!vis[v]) {
					dis[v] = dis[cur]+1;
					vis[v] = true;
					Q.add(v);
				}
			}
		}
		return dis[end];
	}

}