import java.util.*;
public class CCC10J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = 0;
		int b = 0;
		while(true) {
			int x = in.nextInt();
      if(x == 7) break;
      String s = in.next();
			if(x == 1) {
				if(s.equals("A")) a = in.nextInt();
        else if(s.equals("B")) b = in.nextInt();
			}

			else if(x == 2) {
				if(s.equals("A")) System.out.println(a);
        else if(s.equals("B")) System.out.println(b);
			}
			else if(x == 3) {
        String st = in.next();
				if(s.equals("A") && st.equals("B"))a += b;
        else if(s.equals("B") && st.equals("A")) b += a;
				else if(s.equals("A") && st.equals("A")) a += a;
				else if(s.equals("B") && st.equals("B")) b += b;
			}
		else if(x == 4) {
        String st = in.next();
				if(s.equals("A") && st.equals("B"))a *= b;
        else if(s.equals("B") && st.equals("A")) b *= a;
				else if(s.equals("A") && st.equals("A")) a *= a;
				else if(s.equals("B") && st.equals("B")) b *= b;
		}
		else if(x == 5) {
        String st = in.next();
				if(s.equals("A") && st.equals("B"))a -= b;
        else if(s.equals("B") && st.equals("A")) b -= a;
				else if(s.equals("A") && st.equals("A")) a -= a;
				else if(s.equals("B") && st.equals("B")) b -= b;
		}
		else if(x == 6) {
        String st = in.next();
				if(s.equals("A") && st.equals("B"))a /= b;
        else if(s.equals("B") && st.equals("A")) b /= a;
				else if(s.equals("A") && st.equals("A")) a /= a;
				else if(s.equals("B") && st.equals("B")) b /= b;
		}
		}
	}
}
