import java.util.Scanner;

public class CCC08J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char s [] = input.nextLine().toCharArray();
		int r = 0, c = 0, move = 0;
		for(int i = 0; i < s.length; i ++) {
			int dis = s[i] - 'A', nr = dis/6, nc = dis % 6;
			if(s[i] == ' ') {
				nr = 4; nc = 2;
			}
			else if(s[i] == '-') {
				nr = 4; nc = 3;
			}
			else if(s[i] == '.') {
				nr = 4; nc = 4;
			}
			move += Math.abs(nr - r) + Math.abs(nc - c);
			r = nr; c = nc;
		}
		move += Math.abs(4 - r) + Math.abs(5 - c);
		System.out.println(move);

	}

}