import java.util.*;
public class CCC05J5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true) {
			String s = in.nextLine();
			if(s.equals("X"))break;
			System.out.println(IsMonkeyWord(s)?"YES":"NO");
		}
	}
	public static boolean IsMonkeyWord(String s) {
		if(IsAWord(s))return true;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'N') {
				if(IsAWord(s.substring(0, i)) && IsMonkeyWord(s.substring(i+1)))
					return true;
			}
		}
		return false;
	}
	public static boolean IsAWord(String s) {
		if(s.length()==0) return false;
		if(s.length()==1) return s.equals("A");
		if(s.charAt(0) == 'B' && s.charAt(s.length()-1) == 'S' 
				&& IsMonkeyWord(s.substring(1,s.length()-1)))return true;
		return false;
	}

}