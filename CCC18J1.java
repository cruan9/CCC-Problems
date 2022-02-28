import java.util.*;
public class CCC18J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [] arr = new int[4];
		for(int i = 0; i < 4; i ++) {
			arr[i] = in.nextInt();
		}
		if(arr[0] == 8 || arr[0] == 9) {
			if(arr[1] == arr[2]) {
				if(arr[3] == 8 || arr[3] == 9)
					System.out.println("ignore");
				else 
					System.out.println("answer");
			}
			else
				System.out.println("answer");
		}
		else {
			System.out.println("answer");
		}
	}

}