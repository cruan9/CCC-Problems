import java.util.*;
public class CCC10S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String computer = ""; int best = 0;
		String computer2 = ""; int best2 = 0;
		for(int i = 0; i < N; i++) {
			String comp = in.next();
			int R = in.nextInt(), S = in.nextInt(), D = in.nextInt();
			if((2*R)+(3*S)+D > best) { computer2 = computer; best2 = best; best = (2*R)+(3*S)+D; computer = comp; }
			else if((2*R)+(3*S)+D == best) {
				String arr[] = new String[2];
				arr[0] = comp; arr[1] = computer;
				Arrays.sort(arr);
				if(arr[0] == comp) { computer2 = computer; best2 = best; best = (2*R)+(3*S)+D; computer = comp; }
				else { computer2 = comp; best2 = best; }
			}
			else if((2*R)+(3*S)+D > best2) { best2 = (2*R)+(3*S)+D; computer2 = comp; }
			else if((2*R)+(3*S)+D == best2) {
				String arr[] = new String[2];
				arr[0] = comp; arr[1] = computer2;
				Arrays.sort(arr);
				if(arr[0] == comp) { best2 = (2*R)+(3*S)+D; computer2 = comp; }
			}
		}
		System.out.println(computer);
		System.out.println(computer2);
	}

}