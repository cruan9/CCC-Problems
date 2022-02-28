import java.util.*;
public class CCC04S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		String a[][] = new String[N][3];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 3; j++) {
				a[i][j] = in.nextLine();
			}
			if(a[i][0].startsWith (a[i][1]) || a[i][0].startsWith (a[i][2]) || a[i][1].startsWith (a[i][2]) || a[i][1].startsWith (a[i][0]) ||
					a[i][2].startsWith (a[i][0]) || a[i][2].startsWith (a[i][1]) ||a[i][0].endsWith (a[i][1]) ||a[i][0].endsWith (a[i][2]) ||
					a[i][1].endsWith (a[i][2]) || a[i][1].endsWith (a[i][0]) ||a[i][2].endsWith (a[i][0]) ||a[i][2].endsWith (a[i][1])) {
					System.out.println("No");
			}
			else System.out.println("Yes");
		}
	}

}