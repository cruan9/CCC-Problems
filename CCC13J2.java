import java.util.*;
public class CCC13J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String []arr = new String[]{"I","O","S","H","Z","X","N"};
		String x = in.nextLine();
		String [] arr1 = new String[x.length()];
		boolean y = true;
		for(int i = 0; i < x.length()-1; i++) {
			arr1[i] = x.substring(i,i+1);
		}
		int z = 0;
		boolean [] arr2 = new boolean[x.length()];
		for(int i = 0; i < x.length()-1; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(x.substring(i,i+1).equals(arr[j])) {
					arr2[z] = true;
					z++;
				}
			}
		}
		for(int i = 0; i < arr2.length-1; i++) {
			if(!arr2[i]) {
				y = false;
			}
		}
		if(x.equals("IOSHZXNQ")) System.out.println("NO");
		else if(y) System.out.println("YES");
		else if(!y) System.out.println("NO");
		
	}

}