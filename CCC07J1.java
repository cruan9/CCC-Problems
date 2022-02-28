import java.io.*;
import java.util.*;

public class CCC07J1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[3];
        arr[0] = in.nextInt();
        arr[1] = in.nextInt();
        arr[2] = in.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}