import java.util.*;
public class CCC18S2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(), a[][] = new int[N][N];
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N; i++) {
				a[j][i] = in.nextInt();
			}
		}
		int arr[][] = a;
		int MIN = Math.min(Math.min(a[0][0], a[0][N-1]), Math.min(a[N-1][0], a[N-1][N-1]));
		if(a[N-1][0] == MIN) { arr = rotate(a);}
		else if(a[N-1][N-1] == MIN) { int temp[][] = rotate(a); arr = rotate(temp);}
		else if(a[0][N-1] == MIN) { int temp[][] = rotate(a); int temp2[][] = rotate(temp); arr = rotate(temp2);}
		print(arr);
	}
	public static int[][] rotate(int a[][]) {
		int arr[][] = new int[a.length][a.length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				arr[j][a.length-i-1] = a[i][j];
			}
		}
		return arr;
	}
	public static void print(int a[][]) {
		for(int i = 0; i < a.length; i++, System.out.println())
			for(int j = 0; j <a[i].length; j++)
				System.out.print(a[i][j] + " ");
	}

}