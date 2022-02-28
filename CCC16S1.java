import java.util.*;
public class CCC16S1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine(), st = in.nextLine();
    HashMap<Character, Integer> mp1 = new HashMap<Character, Integer>();
    HashMap<Character, Integer> mp2 = new HashMap<Character, Integer>();
    int ast = 0;
    for(int i = 0; i < s.length() && i < st.length(); i++){
     
      if(!mp1.containsKey(s.charAt(i))){
        mp1.put(s.charAt(i), 1);
      }
      else mp1.put(s.charAt(i), mp1.get(s.charAt(i))+1);
       if(st.charAt(i) == '*'){
        ast++; continue;
      } 
      if(!mp2.containsKey(st.charAt(i))){
        mp2.put(st.charAt(i), 1);
      }
      else mp2.put(st.charAt(i), mp2.get(st.charAt(i))+1);
    }
    int diff = 0;
    for(int i = 97; i <= 122; i++){
      if(mp1.containsKey((char)i) && mp2.containsKey((char)i)){
        if(mp1.get((char)i) < mp2.get((char)i)){
          System.out.println("N"); return;
        }
        diff += mp1.get((char)i)-mp2.get((char)i);
      }
      else if(mp1.containsKey((char)i) && !mp2.containsKey((char)i)){
        diff += mp1.get((char)i);
      }
      else if(!mp1.containsKey((char)i) && mp2.containsKey((char)i)){
        System.out.println("N"); return;
      }
    }
    if(diff <= ast) System.out.println("A");
    else System.out.println("N");
  }
}