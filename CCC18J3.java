import java.util.*;
public class CCC18J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [] arr = new int[5];
		int [][] arr1 = new int[5][5];
		arr[0] = 0;
		for(int i = 1; i < 5; i ++) {
			arr[i] = in.nextInt();
		}
		for(int j = 0; j < arr.length; j++) {
			int temp = 0;
			for(int k = 0; k <= j; k++) {
				temp += arr[k];
			}
			arr1[0][j] = temp;
		}
		for(int i = 1; i < 5; i ++) {
			for(int j = 0; j < 1; j++) {
				arr1[i][j] = Math.abs(arr1[i-1][j] + arr[i]);
			}
		}
		for(int i = 1; i < 5; i ++) {
			for(int j = 2; j < 5; j++) {
				arr1[i][j] = Math.abs(arr1[i-1][j] - arr[i]);
			}
		}
		arr1[4][2] = arr1[2][4]; 
		arr1[2][1] = arr1[1][2];
		arr1[3][1] = arr1[1][3];
		arr1[4][1] = arr1[1][4];
			
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println("");
		}
		
	}

}