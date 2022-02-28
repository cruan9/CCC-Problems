import java.util.*;
public class CCC05S4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] arr = new String [1000];  
		String[] arr2 = new String [1000];
		int l = in.nextInt();
		for(int k = 0 ; k < l ; k++){
		    int n = in.nextInt();
		    int p = 0;
		    for(int i = 0 ; i < n ; i++) {
		    	arr2[p++] = in.next();
		    }
		    int max = 0;
		    arr[0] = arr2[p-1];
		    p = 0;
		    for(int i = 0; i < n; i++){
				int x = 0;
				while (x <= p && !arr2[i].equals (arr[x])) {
					x++;
				}
				arr[x] = arr2[i];
				p = x;
				if (p >= max) max = p;
			    }
		    System.out.println ("" + (n*10-2*max*10));
		}
	 }
}