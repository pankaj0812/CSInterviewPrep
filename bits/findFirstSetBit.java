/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i =0; i<t; i++){
		    int n = sc.nextInt();
		    if(n==0)
		        System.out.println(0);
		    else{
		        int count = 0;
		        while((n&(1<<count))==0) // left shift op adding zeros at the end. the count decides how many zeroes
		            count++;
		      
		     System.out.println(++count);       
		    }
		    
		   
	        }
		    
		}
	
}
