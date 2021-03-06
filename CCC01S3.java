import java.util.*;
public class CCC01S3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		String[] letters = new String[27]; map.put(null,0);
		ArrayList<Integer> [] adj = new ArrayList[27];
		Queue<E> Q = new LinkedList<>();
		for(int i = 1; i <= 26; i++) adj[i] = new ArrayList<>();
		String str = in.nextLine();
		while(!str.equals("**")) {
			int X, Y;
			String A = str.substring(0, 1);
			String B = str.substring(1);
			if(map.containsKey(A)) X = map.get(A);
			else {
				X = map.size();
				map.put(A, map.size());
				letters[X] = A;
			}
			if(map.containsKey(B)) Y = map.get(B);
			else {
				Y = map.size();
				map.put(B, map.size());
				letters[Y] = B;
			}
			adj[X].add(Y); adj[Y].add(X);
			Q.add(new E(X, Y));
			str = in.nextLine();
		}
		Stack<String> S = new Stack<>();
		int ans = 0;
        while(!Q.isEmpty()) {
            E e = Q.poll();
            Integer boop = e.y;
            adj[e.x].remove(boop);
            int count = 1;
            Queue<Integer> q = new LinkedList<>();
            boolean[] vis = new boolean[27];
            q.add(e.x); vis[e.x] = true;
            while(!q.isEmpty()) {
                int cur = q.poll();
                for(int x: adj[cur]) {
                    if(!vis[x]) {
                        vis[x] = true;
                        count++;
                        q.add(x);
                    }
                }
            }
            adj[e.x].add(e.y);
            if(count != map.size()-1) {
                String string = letters[e.x] + letters[e.y];
                S.add(string);
                ans++;
            }
        }
        if(ans != 0) {
            while(!S.isEmpty()) System.out.println(S.pop());
            System.out.println("There are " + ans + " disconnecting roads.");
        }
        else System.out.println("There are 0 disconnecting roads.");
    }
	}
	class E{
		public int x,y;
		E(int x0, int y0) {x = x0; y = y0;}
	}