import java.util.*;	
public class CCC04S3 {
    public static int[][] adj = new int[11][10];
    public static String[][] str = new String[11][10];

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(in.nextLine());
            for (int j = 0; j < 9; j++) {
                str[i][j] = st.nextToken();
                adj[i][j] = -1;
            }
        }
        boolean x = true;
        while (x) {
            x = false;
            for(int i = 0; i < 10; i++)
                for(int j = 0; j < 9; j++) {
                    StringTokenizer st = new StringTokenizer(str[i][j], "+");
                    int z = 0;
                    int y = 0;
                    while (st.hasMoreTokens() && y != -1) {
                        y = convert(st.nextToken());
                        if (y == -1) z = -1;
                        else z += y;
                    }
                    if (adj[i][j] != z) {
                        x = true;
                        adj[i][j] = z;
                    }
                }
        }
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 9; j++)
                if (adj[i][j] == -1)
                    System.out.print("* ");
                else
                    System.out.print(adj[i][j] + " ");
            System.out.println();
        }
    }
    public static int convert(String str) {
        int x;
        if (str.charAt(0) >= 'A' && str.charAt(0) <= 'J')
            x = adj[str.charAt(0) - 'A'][str.charAt(1) - '1'];
        else
            x = Integer.parseInt(str);
        return x;
    }
}