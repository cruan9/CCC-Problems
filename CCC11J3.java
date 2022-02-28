import java.util.*;
public class CCC11J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t1 = in.nextInt();
		int t2 = in.nextInt();
		ArrayList<Integer> pattern = new ArrayList<Integer>();
		if(t1 > 0) {
			pattern.add(t1);
		}
		if(t2 > 0) {
			pattern.add(t2);
		}
		int x = 1;
		while(x >= 0) {
			x = pattern.get(pattern.size()- 2) - pattern.get(pattern.size() - 1);
			if(x < 0) {
				break;
			}
			pattern.add(x);

		}
		System.out.println(pattern.size());


	}

}