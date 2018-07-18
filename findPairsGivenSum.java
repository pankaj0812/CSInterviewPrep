/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int x=sc.nextInt();
			int flag=0;
			int[] a=new int[n];
			int[] b=new int[m];
			for(int j=0;j<n;j++){
			    a[j]=sc.nextInt();
			}
			for(int j=0;j<m;j++){
			    b[j]=sc.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);

			findPairs(a, b, n, m, x);
		}
	}
	
	public static void findPairs(int a[], int b[], int n, int m, int x){
	    HashMap<Integer, Integer> hm  = new HashMap<Integer, Integer>();
	    for(int i=0; i<n; i++){
	        hm.put(a[i], 0);
	    }
	    
	    for(int i=0; i<m; i++){
	        if(hm.containsKey(x-b[i]))
	            System.out.print(x-b[i] + " " + b[i] + ",");
	    }
	   System.out.println();

	}
}
