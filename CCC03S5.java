import java.io.*;
import java.util.*;
public class CCC03S5 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int c = readInt(), r = readInt(), d = readInt();
		ArrayList<E>[] adj = new ArrayList[c+1];
		for(int i = 0; i <= c; i++) {
			adj[i] = new ArrayList<E>();
		}
		for(int i = 0; i < r; i++) {
            int x = readInt(); int y = readInt(); int z = readInt();
            adj[x].add(new E(y, z)); adj[y].add(new E(x, z));
        }
		int[] dis = new int[c+1];
        PriorityQueue<E> Q = new PriorityQueue<>();
        Q.add(new E(1, 0)); dis[1] = 0;
        while(!Q.isEmpty()) {
            E cur = Q.poll();
            if(cur.y > dis[cur.x]) continue;
            for(E e: adj[cur.x]) {
                if (dis[e.x] < e.y) {
                    dis[e.x] = e.y;
                    Q.add(new E(e.x, dis[e.x]));
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < d; i++) {
            int tmp = readInt();
            min = Math.min(dis[tmp], min);
        }
        System.out.println(min);
	}
    static class E implements Comparable<E> {
        public int x, y;
        E(int x0, int y0) {x = x0; y = y0;}
        public int compareTo(E o) {
            return 0;
        }
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
}