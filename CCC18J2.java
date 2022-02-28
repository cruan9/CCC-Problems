import java.util.*;
public class CCC18J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		String y = in.next(), z = in.next();
		int count = 0;
		char [] arr1 = y.toCharArray();
		char [] arr2 = z.toCharArray();
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] == arr2[i] && arr1[i] == 'C') {
				count++;
			}
		}
		System.out.println(count);
		
	}

}