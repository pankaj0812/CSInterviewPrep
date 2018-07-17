
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
		    int X= sc.nextInt();
		    int [] arr = new int[N];
		    for(int j=0;j<N;j++)
		    {
		       arr[j]=sc.nextInt(); 
		    }
		    printSubArray(arr,N,X);
		}
	}
	
	public static void printSubArray(int [] arr,int N,int X)
	{
	    int sum=0;
	    int cur=0;
	    
	    for(int i=0;i<N;i++)
	    {
	        sum=sum+arr[i];
	        if(sum==X)
	        {
	            System.out.println((cur+1)+" "+(i+1));
	            return;
	        }
	        else if(sum>X)
	        {
	            while(sum>X && cur <=i)
	            {
	                sum=sum-arr[cur];
	                cur++;
	            }
	            if(sum==X)
	            {
	                System.out.println((cur+1)+" "+(i+1));
	                return;
	            }
	        }
	    }
	    System.out.println(-1);
	}
}
