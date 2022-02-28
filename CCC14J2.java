import java.util.Scanner;
public class CCC14J2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int A = 0,B = 0;
        String votes = sc.nextLine();
        for (int i = 0; i < N; i++) {
            if(votes.charAt(i) == 'A') {
                A ++;                    
            }else{
                B ++;
            }
        }
        if (A > B) System.out.println("A");
        else if (A < B) System.out.println("B");
        else System.out.println("Tie");
    }

}