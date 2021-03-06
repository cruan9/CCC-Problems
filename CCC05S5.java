import java.util.*;
import java.io.*;
public class CCC05S5 {
	static int [] a = new int[100002];
	static int [] b = new int[100002];
	static int [] bit = new int [100002];
	static long ans = 0;
	static int N = 0;
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++){
			a[i] = Integer.parseInt(br.readLine());
			b[i] = a[i];
		}
		Arrays.sort(b, 0, N);
		for(int i=0; i<N; i++){
			int rk = Arrays.binarySearch(b, 0, N, a[i])+1;
			ans += i - query(rk) + 1;
			update(rk, 1);
		}
		System.out.printf("%.2f", ans*100/N/100.0);
	}
	static void update(int pos, int v){
		for(int i=pos; i<=N; i+= i&-i)
			bit[i] += v;
	}
	static int query(int pos){
		int sum = 0;
		for(int i=pos; i>0; i-= i&-i)
			sum += bit[i];
		return sum;
	}
}