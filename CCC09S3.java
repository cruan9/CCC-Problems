import java.util.*;
public class CCC09S3 {
	public static ArrayList<Integer> []adj;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		adj = new ArrayList[50];
		for(int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		adj[1].add(6); adj[2].add(6); adj[3].addAll(Arrays.asList(4,5,6,15)); adj[4].addAll(Arrays.asList(3,5,6));
		adj[5].addAll(Arrays.asList(3,4,6)); adj[6].addAll(Arrays.asList(1,2,3,4,5,7)); adj[7].add(6); adj[7].add(8);
		adj[8].addAll(Arrays.asList(7,9)); adj[9].addAll(Arrays.asList(8,10,12)); adj[10].addAll(Arrays.asList(9,11));
		adj[11].addAll(Arrays.asList(10,12)); adj[12].addAll(Arrays.asList(9,11,13)); adj[13].addAll(Arrays.asList(12,14,15));
		adj[14].add(13); adj[15].add(3); adj[15].add(13); adj[16].add(17); adj[16].add(18); adj[17].add(16); adj[17].add(18);
		adj[18].add(16); adj[18].add(17);
		String st = in.next();
		while(!st.equals("q")) {
			int x = in.nextInt();
			if(st.equals("i")) {
				int y = in.nextInt();
				adj[x].add(y);
				adj[y].add(x); 
			}
			else if(st.equals("d")) {
				int y = in.nextInt();
				adj[x].remove(new Integer(y));
				adj[y].remove(new Integer(x));
			}
			else if(st.equals("n")) {
				System.out.println(adj[x].size());
			}
			else if(st.equals("f")) {
                Queue<Integer> Q = new LinkedList<>();
                boolean[] vis = new boolean[51]; int count = 0;
                vis[x] = true;
                for(int v: adj[x]) {
                    vis[v] = true;
                    Q.add(v);
                }
                while(!Q.isEmpty()) {
                    int cur = Q.poll();
                    for(int v: adj[cur]) {
                        if(!vis[v]) {
                            vis[v] = true;
                            count++;
                        }
                    }
                }
                System.out.println(count);

			}
			else if(st.equals("s")) {
				int y = in.nextInt();
				System.out.println(bfs(x,y));
			}
			st = in.next();
		}
		
	}
	public static String bfs(int x, int y) {
		boolean[] vis = new boolean[50];
		int[] dis = new int[50];
		Queue<Integer> Q = new LinkedList<Integer>();
		Q.add(x);
		dis[y] = -1;
		vis[x] = true;
		while(!Q.isEmpty()) {
			int cur = Q.poll();
			for(int v: adj[cur]) {
				if(!vis[v]) { 
					Q.add(v); 
					dis[v] = dis[cur]+1; 
					vis[v] = true;

				}
			}
		}
		if(dis[y] != -1) return Integer.toString(dis[y]);
		else return "Not connected";
	}

}