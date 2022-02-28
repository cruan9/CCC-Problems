import java.util.Scanner;

public class CCC08J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int b = input.nextInt(), n = input.nextInt();
		char song [] = {'A','B','C','D','E'};
		while(b != 4) {
			if(b == 1) {
				for(int i = 0; i < n; i ++) {
					char tmp = song[0];
					for(int j = 0; j < 4; j++) {
						song[j] = song[j+1];
					}
					song[4] = tmp;
				}
			}
			else if(b == 2) {
				for(int i = 0; i < n; i++) {
					char tmp = song[4];
					for(int j = 4; j > 0; j--) {
						song[j] = song[j-1];
					}
					song[0] = tmp;
				}
			}
			else if(b == 3) {
				if( n % 2 == 1) {
					char tmp = song[0]; 
					song[0] = song[1]; 
					song[1] = tmp;
				}
			}
			b = input.nextInt(); n = input.nextInt();
		}
		for(int i = 0; i < 5; i ++) {
			System.out.print(song[i] + " ");
		}
		
	}

}