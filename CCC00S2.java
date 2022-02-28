import java.io.*;
import java.util.*;
public class CCC00S2 {
    public static void main(String[] args) throws IOException {
        int n = readInt();
        LinkedList<Float> adj = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            adj.add(Float.parseFloat(readLine()));
        }
        String S = readLine();
        while(!S.equals("77")) {
            if(S.equals("99")) {
                int index = readInt()-1;
                float before = adj.remove(index);
                float flow = before * Float.parseFloat(readLine())/100;
                adj.add(index, before - flow);
                adj.add(index, flow);
            } else {
                int index = readInt()-1;
                adj.add(index, adj.remove(index) + adj.remove(index));
            }
            S = readLine();
        }
        for(Float x: adj) {
            System.out.print(Math.round(x) + " ");
        }
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