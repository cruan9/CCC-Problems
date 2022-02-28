import java.util.*;
public class CCC03S3 {
	public static int n, r, c, count;
	public static int []ans;
	public static int [][]adj;
	public static boolean [][]vis;
	public static Queue<E> q;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        n = in.nextInt(); r = in.nextInt(); c = in.nextInt();
        adj = new int[r+2][c+2]; vis = new boolean[r+2][c+2]; ans = new int[625];
        for(int i = 1; i <= r; i++) {
            String tmp = in.next();
            for(int j = 1; j <= c; j++) {
                String s = tmp.substring(j-1, j);
				if(s.equals(".")) {
					adj[i][j] = 0;
					vis[i][j] = true;
				}
				else {
					adj[i][j] = 1;
				}
			}
		}

		room();
		Arrays.sort(ans);
		int rooms = 0;
		int total = 0;
		int i = 624;
		while(n - total > 0 && ans[i] != 0) {
			if(total + ans[i] <= n) {
				total += ans[i];
				rooms++;
			}
			else {
				break;
			}
			i--;
		}
		if(rooms == 1) System.out.println(rooms + " room, " + (n-total) + " square metre(s) left over");
		else System.out.println(rooms + " rooms, " + (n-total) + " square metre(s) left over");
		
	}
	public static boolean room() {
        int x = 0;
        for(int i = 1; i <= r; i++) {
            for(int j = 1; j <= c; j++) {
                count = 1;
                if(vis[i][j]) {
                    findroom(i, j);
                    ans[x] = count;
                    x++;
                }
            }
        }
        return false;
    }

    public static void findroom(int i, int j) {
        vis[i][j] = false;
        if (i > 0 && i <= r && j > 0 && j <= c) {
            if (vis[i + 1][j] && adj[i + 1][j] != -1) {findroom(i+1, j); count++;}
            if (vis[i - 1][j] && adj[i - 1][j] != -1) {findroom(i-1, j); count++;}
            if (vis[i][j + 1] && adj[i][j + 1] != -1) {findroom(i, j+1); count++;}
            if (vis[i][j - 1] && adj[i][j - 1] != -1) {findroom(i, j-1); count++;}
        }
    }
	public static class E{
		public int x,y;
		E(int x0, int y0){ x = x0; y = y0;}
	}
	
}