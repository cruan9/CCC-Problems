import java.util.*;
public class CCC16J2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] nums = new int[4][4];
        int [] sumhor = new int[4];
        int [] sumver = new int[4];
        for(int i = 0; i < 4; i ++){
            for(int j = 0; j < 4; j ++){
                nums[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < 4; i ++){
            for(int j = 0; j < 4; j ++){
                sumhor[i] = nums[i][j] + sumhor[i];
            }
        }
        for(int i = 0; i < 4; i ++){
            for(int j = 0; j < 4; j ++){
                sumver[i] = nums[j][i] + sumver[i];
            }
        }
        if(sumhor[0] == sumhor[1] && sumhor[0] == sumhor[2] && sumhor[0] == sumhor[3]){
            if(sumver[0] == sumver[1] && sumver[0] == sumver[2] && sumver[0] == sumver[3]){
                System.out.println("magic");
            }
            else{
                System.out.println("not magic");
            }
            
        }
        else {
            System.out.println("not magic");
        }
        
    }
}