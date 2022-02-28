import java.util.*;
public class CCC08J4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true) {
			String s = in.nextLine();
			if(s.equals("0"))break;
			String op[] = s.split(" "); Stack<String> st = new Stack<String>();
			for(int i = op.length-1; i >= 0; i --) {
				if(op[i].equals("+") || op[i].equals("-")) {
					String num1 = st.pop(), num2 = st.pop();
					st.push(num1 + " " + num2 + " " + op[i]);
				}else {
					st.push(op[i]);
				}
			}
			System.out.println(st.pop());
		}
		
	}

}