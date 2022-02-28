import java.util.*;
public class CCC07S2 {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int[] l = new int[n];
    	int[] w = new int[n];
    	int[] h = new int[n];
    	long[] a = new long[n];
    	for(int i = 0; i < n; i++) {
    		l[i] = in.nextInt();
    		w[i] = in.nextInt();
    		h[i] = in.nextInt();
    		a[i] = l[i]*w[i]*h[i];
    	}
    	int m = in.nextInt();
    	int[] l2 = new int[m];
    	int[] w2 = new int[m];
    	int[] h2 = new int[m];
    	for(int i = 0; i < m; i++) {
    		l2[i] = in.nextInt();
    		w2[i] = in.nextInt();
    		h2[i] = in.nextInt();
    	}
    	long size = (long) (Math.pow(2000, 3)+1);
    	for(int i = 0; i < l2.length; i++) {
    		for(int j = 0; j < l.length; j++) {
    			if(l[j] >= l2[i] && w[j] >= w2[i] && h[j] >= h2[i] && a[j] < size) {
    				size = a[j];
    			}
    			else if(l[j] >= l2[i] && h[j] >= w2[i] && w[j] >= h2[i] && a[j] < size) {
    				size = a[j];
    			}
    			else if(w[j] >= l2[i] && l[j] >= w2[i] && h[j] >= h2[i] && a[j] < size) {
    				size = a[j];
    			}
    			else if(w[j] >= l2[i] && h[j] >= w2[i] && l[j] >= h2[i] && a[j] < size) {
    				size = a[j];
    			}
    			else if(h[j] >= l2[i] && l[j] >= w2[i] && w[j] >= h2[i] && a[j] < size) {
    				size = a[j];
    			}
    			else if(h[j] >= l2[i] && w[j] >= w2[i] && l[j] >= h2[i] && a[j] < size) {
    				size = a[j];
    			}
    				
    			}
    			if(size != (Math.pow(2000, 3)+1)) {
    				System.out.println(size);
    			}	
    			else {
    				System.out.println("Item does not fit.");
    			}
    			size = (long) (Math.pow(2000, 3)+1);
    		}
    	}
    
    }