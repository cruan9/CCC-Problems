import java.util.*;
public class CCC10J5 {
	static int [][] board = new int[9][9];
	static int endx, endy;
	static boolean found = false;
	static LinkedList<Integer> Q = new LinkedList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int startx = in.nextInt();
		int starty = in.nextInt();
		endx = in.nextInt();
		endy = in.nextInt();
		Q.add(startx);
		Q.add(starty);
		board[startx][starty] = 0;
		if(startx == endx && starty == endy) {
			System.out.println(0);
		}
		else {
			while(board[endx][endy] == 0){
				int x = Q.poll();
				int y = Q.poll();
				check(x,y);
			}
			System.out.println(board[endx][endy]);
		}
	}
	public static void distance(int x, int y, int dis) {
        if(board[x][y] == 0) {
            board[x][y] = dis;
            Q.add(x);
            Q.add(y);
        }
    }

    public static void check(int x, int y) {
        if(x - 1 > 0 && y - 2 > 0 && x - 1 <= 8 && y - 2 <= 8) {
            distance(x -1, y - 2, board[x][y]+1);
        }
        if(x - 1 > 0 && y + 2 > 0 && x - 1 <= 8 && y + 2 <= 8) {
            distance(x -1, y + 2, board[x][y]+1);
        }
        if(x - 2 > 0 && y - 1 > 0 && x - 2 <= 8 && y - 1 <= 8) {
            distance(x - 2, y - 1, board[x][y]+1);
        }
        if(x - 2 > 0 && y + 1 > 0 && x - 2 <= 8 && y + 1 <= 8) {
            distance(x - 2, y + 1, board[x][y]+1);
        }
        if(x + 1 > 0 && y - 2 > 0 && x + 1 <= 8 && y - 2 <= 8) {
            distance(x +1, y - 2, board[x][y]+1);
        }
        if(x + 1 > 0 && y + 2 > 0 && x + 1 <= 8 && y + 2 <= 8) {
            distance(x +1, y + 2, board[x][y]+1);
        }
        if(x + 2 > 0 && y - 1 > 0 && x + 2 <= 8 && y - 1 <= 8) {
            distance(x +2, y - 1, board[x][y]+1);
        }
        if(x + 2 > 0 && y + 1 > 0 && x + 2 <= 8 && y + 1 <= 8) {
            distance(x +2, y + 1, board[x][y]+1);
        
        }
    }

}
