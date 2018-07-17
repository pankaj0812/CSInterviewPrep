/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	 public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T= sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    int N= sc.nextInt();
		    int [] arr = new int[N];
		    for(int j=0;j<N;j++)
		    {
		       arr[j]=sc.nextInt(); 
		    }
		    System.out.println(equilibrium(arr,N));

		}
	}
	
	public static int  equilibrium(int []arr, int N){
	    int sum =0; 
	    int left = 0;
	    for(int i=0; i<N; i++) sum+=arr[i];
	    
	   for (int i = 0; i < N; ++i) {
        sum -= arr[i]; // sum is now right sum for index i
 
        if (left == sum)
            return i+1;
 
        left += arr[i];
    }
    return -1;
	    
	}
}
