import java.util.*;
public class CCC16J4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String time = in.nextLine();
		int min = Integer.parseInt(time.substring(3,5)), hr = Integer.parseInt(time.substring(0,2));
		int total = min + hr*60;
		for(int i = 0; i < 120; i++) {
			if(total >= 420 && total < 600) total += 2;
			else if(total >= 900 && total < 1140)  total+= 2;
			else total++;
		}
		int finalmin = total % 60;
		int finalhr = ((total-finalmin)/60)%24;
		if(finalhr < 10) System.out.print(0);
		System.out.print(finalhr+":");
		if(finalmin < 10) System.out.print(0);
		System.out.print(finalmin);
		
	}

}