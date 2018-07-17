
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    Stack st=new Stack();
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int j=0;j<n;j++){
		        arr[j]=sc.nextInt();
		    }
		  int max=arr[n-1];
		  st.push(max);
		  for(int k=n-2;k>=0;k--){
		      if(max<arr[k]){
		          max=arr[k];
		          st.push(max);
		      }
		  }
		  while(!st.isEmpty()){
		      System.out.print(st.pop()+" ");
		  }
		  System.out.println();
		}
	}
}

// uses Stacks
//Complexity => o(n)
