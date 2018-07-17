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
		    sortArrayNumbers(arr,N);
	  System.out.println();

		}
	}
	
	public static void sortArrayNumbers(int [] arr,int N){
	    ArrayList<Integer> numCount=new ArrayList<Integer>();
        numCount.add(0);
        numCount.add(0);
        numCount.add(0);

        for(int j=0; j<N; j++){
            if(arr[j]==0) numCount.set(0, numCount.get(0)+1);
            if(arr[j]==1) numCount.set(1, numCount.get(1)+1);
            if(arr[j]==2) numCount.set(2, numCount.get(2)+1);
        }
        
        for(int k=0; k<3; k++){
            int len = numCount.get(k);
            for(int i=0; i<len; i++)
                System.out.print(k+" ");
            
        }

	}

}
