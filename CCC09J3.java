import java.util.*;
public class CCC09J3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int time = in.nextInt();
		fun(time, "Ottawa");
		fun(time-300,"Victoria");
		fun(time-200, "Edmonton");
		fun(time-100, "Winnipeg");
		fun(time,"Toronto");
		fun(time+100,"Halifax");
		fun(time+130, "St. John's");
	}
	public static void fun(int t, String city) {
		if(t < 0) t += 2400;
		int h = t / 100, m = t % 100;
		if(m >= 60) {h += m/60; m %= 60;}
		if(h >= 24) {h-= 24;}
		System.out.println((h*100 + m)+ " in " + city);
	}
}