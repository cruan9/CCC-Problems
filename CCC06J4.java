import java.util.*;
public class CCC06J4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		boolean arr[][] = new boolean[8][8];
		boolean done[] = new boolean[8];
		int[] order = new int[7];
		arr[7][1] = true; arr[4][1] = true; arr[1][2] = true; arr[4][3] = true; arr[5][3] = true;
		int x = in.nextInt();
		int y = in.nextInt();
		int tasks = 0;
		while(true && x != 0 && y != 0) {
			arr[y][x] = true;
			x = in.nextInt();
			y = in.nextInt();
		}
		int count = 0;
		while(tasks < 7 && count < 10) {
			for(int i = 1; i < 8; i++) {
				boolean possible = true;
				for(int j = 1; j < arr[i].length; j++) {
					if(arr[i][j] && !done[j]) {
						possible = false;
					}
				}
				if(possible && !done[i]) {
					order[tasks] = i;
					done[i] = true;
					tasks++;
					break;
				}
			}
			count++;
		}
		if(count >= 10) System.out.println("Cannot complete these tasks. Going to bed.");
		else {
			for(int i = 0; i < order.length; i++) {
				System.out.print(order[i] + " ");
			}
		}
	}

}