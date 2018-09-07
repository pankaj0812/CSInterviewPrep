/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static void kthBitSet(int n, int k){
        int bit = n & (1<<k);
      //  System.out.println(bit);
        if(bit>=1)
            System.out.println("Yes");
        else 
            System.out.println("No");
        
    }
    
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++){
		    
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    kthBitSet(n, k);
		}
	}
}
