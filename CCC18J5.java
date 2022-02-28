import java.util.*;
public class CCC18J5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<Integer> adj [] = new ArrayList[N+1];
		for(int i = 1; i <= N; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		for(int i = 1; i <= N; i++) {
			int num = in.nextInt();
			for(int j = 1; j <= num; j++) {
				adj[i].add(in.nextInt());
			}
		}
		int dis [] = new int[N+1]; boolean vis[] = new boolean[N+1];
		Queue<Integer> Q = new LinkedList<Integer>();
		Q.add(1); vis[1] = true; dis[1] = 1; //push start point into Q
		while(!Q.isEmpty()) {
			int cur = Q.poll();
			for(int v: adj[cur]) {
				if(!vis[v]) { Q.add(v); dis[v] = dis[cur]+1; vis[v] = true;}
			}
		}
		boolean flag = true; int min = Integer.MAX_VALUE;
		for(int i = 1; i <= N; i++) {
			if(!vis[i]) flag = false;
			if(adj[i].isEmpty() && vis[i]) min = Math.min(min, dis[i]);
		}
		if(flag)System.out.println("Y");
		else System.out.println("N");
		System.out.println(min);
	
		
	}

}