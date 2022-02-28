import java.util.*;
public class CCC08S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
    int min = Integer.MAX_VALUE;
    String mincity = "";
    while(true){
      String s = in.next();
      int temp = in.nextInt();
      if(temp < min){
        min = temp; mincity = s;
      }
      if(s.equals("Waterloo")) break;
    }
    System.out.println(mincity);
	}

}