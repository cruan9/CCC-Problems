import java.util.*;
public class CCC12J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String arr[][] = new String[3][3];
		arr[0][0] = "*";
		arr[0][1] = "x";
		arr[0][2] = "*";
		arr[1][0] = " ";
		arr[1][1] = "x";
		arr[1][2] = "x";
		arr[2][0] = "*";
		arr[2][1] = " ";
		arr[2][2] = "*";
		int x = in.nextInt();
		int k = 0;
		int b = 0;
		for(int i = 1; i <= 3*x; i++) {
			for(int j = 1; j <= 3*x; j++) {
					System.out.print(arr[k][b]);
					if(j % x == 0) {
						b++;
					}
				}
			b = 0;
			if(i % x == 0) {
				k++;
			}
			System.out.println("");
		}
		
	}

}