import java.util.*;

public class CCC20S1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		CCC20S1 b= new CCC20S1();
		int N = in.nextInt();
		double max = 0;
		v arr[] = new v[N];
		for(int i = 0; i < N; i++) {
			arr[i] = b.new v(in.nextInt(), in.nextInt());
		}
		Arrays.sort(arr);
		for(int i = 1; i < N; i++) {
			max = Math.max(max, Math.abs(arr[i].d - arr[i-1].d)/(arr[i].t - arr[i-1].t));
		}
		System.out.println(max);
	}

	public class v implements Comparable<v>{
		double t;
		double d;
		public v(double t1, double d1) {
			t = t1; d = d1;
		}
		@Override
		public int compareTo(v o) {
			// TODO Auto-generated method stub
			return (int) (this.t-o.t);
		}
	}
}