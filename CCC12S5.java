import java.util.*;
public class CCC12S5 {  
  public static void main(String args[]) { 
    Scanner in = new Scanner(System.in);
    int R = in.nextInt(), C = in.nextInt();
    int K = in.nextInt();
    int dp[][] = new int[C+1][R+1];
    for(int i = 0; i < K; i++){
        int x = in.nextInt(), y = in.nextInt();
        dp[y][x] = -1;
    }
    dp[1][1] = 1;
    for(int i = 1; i <= C; i++){
        for(int j = 1; j <= R; j++){
            if(dp[i][j] == -1) continue;
            else if(dp[i-1][j] == -1 && dp[i][j-1] != -1){
                dp[i][j] = Math.max(dp[i][j], dp[i][j-1]);
            }
            else if(dp[i][j-1] == -1 && dp[i-1][j] != -1) dp[i][j] = Math.max(dp[i][j], dp[i-1][j]);
            else if(dp[i][j-1] == -1 && dp[i-1][j] == -1) dp[i][j] = 0;
            else dp[i][j] = Math.max(dp[i][j], dp[i][j-1] + dp[i-1][j]);
        }
    }
    System.out.println(dp[C][R]);
  }
}