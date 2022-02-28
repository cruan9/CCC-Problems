import java.util.*;
public class CCC05J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<String> directions = new ArrayList<String>();
		while(true) {
			String x = in.nextLine();
			directions.add(x);
			if(x.equals("SCHOOL")) {
				break;
			}
		}
		String arr[] = new String[directions.size()];
		for(int i = 0; i < directions.size(); i++) {
			if(directions.get(i).equals("L")) {
				arr[i] = "RIGHT";
			}
			else if(directions.get(i).equals("R")) {
				arr[i] = "LEFT";
			}
			else{
				arr[i] = directions.get(i);
			}
		}
		int i = arr.length-2;
		while(i > 0) {
			System.out.println("Turn " + arr[i] + " onto " + arr[i-1] + " street.");
			i -= 2;
		}
		System.out.println("Turn " + arr[0] + " into your HOME.");
		
	}

}