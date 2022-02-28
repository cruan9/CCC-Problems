import java.util.*;
public class CCC16S2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int N = in.nextInt();
    int arr1[] = new int[N];
    int arr2[] = new int[N];
    for(int i = 0; i < N; i++) arr1[i] = in.nextInt();
    for(int i = 0; i < N; i++) arr2[i] = in.nextInt();
    Arrays.sort(arr1); Arrays.sort(arr2);
    int sum = 0;
    if(a == 1){
      for(int i = 0; i < N; i++){
        sum += Math.max(arr1[i], arr2[i]);
      }
    }
    if(a == 2){
      int x = arr2.length-1;
      for(int i = 0; i < N; i++, x--){
        sum += Math.max(arr1[i], arr2[x]);
      }
    }
    System.out.println(sum);
  }
}