import java.util.*;
public class CCC15J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String x = in.nextLine();
		int happy = 0;
		int sad = 0;
		for(int i = 0; i < x.length()-3; i++) {
			if(x.substring(i,i+3).equals(":-)")) {
				happy++;
			}
			else if(x.substring(i,i+3).equals(":-(")) {
				sad++;
			}
		}
		if(happy > sad) {
			System.out.println("happy");
		}
		else if(sad > happy) {
			System.out.println("sad");
		}
		else if(sad == happy && sad != 0 && happy != 0) {
			System.out.println("unsure");
		}
		else {
			System.out.println("none");
		}
	}

}