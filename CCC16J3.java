import java.util.*;
public class CCC16J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String x = in.nextLine();
		int max = 1;
		for(int i = 0; i < x.length(); i++) {
			for(int j = x.length(); j > i; j--) {
				String temp = x.substring(i,j);
				String reverse = new StringBuffer(temp).reverse().toString();
				if(reverse.equals(temp) && temp.length() > max) {
					max = temp.length();
				}
			}
		}
		System.out.println(max);
	}

}