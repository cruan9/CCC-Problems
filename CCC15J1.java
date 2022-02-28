import java.util.Scanner;
public class CCC15J1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int day = input.nextInt();
        if(month == 2 && day == 18){
            System.out.println("Special");
        }
        else if(month == 2 && day <= 17 || month == 1){
            System.out.println("Before");
        }
        else if(month == 2 && day >= 19 || month > 2){
            System.out.println("After");
        }
    }
}