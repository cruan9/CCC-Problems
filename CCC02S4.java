import java.util.Scanner;

public class CCC02S4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), y = in.nextInt();
        int ans1 = (int)Math.floor(x/y), ans2 = x%y, gcd =1;
        for(int i = 2; i <= ans2&& i <= y; i++){
            if(ans2%i==0 && y%i==0) gcd = i;
        }
        if (gcd==1){
            if(ans1 != 0 && ans2!=0){
                System.out.println(ans1+ " " + ans2 + "/" + y);
            }else if(ans2==0 && ans1!=0){
                System.out.println(ans1);
            } else {
                System.out.println(ans2+"/"+y);
            }
        } else { 
            ans2=ans2/gcd;
            y=y/gcd;
            if(ans2 != 0 & ans1!=0){
                System.out.println(ans1+ " " + ans2 + "/" + y);
            }else{
                System.out.println(ans2+"/"+y);
            }
        }
    }
    }