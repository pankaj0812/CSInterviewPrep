/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static void toggleBitsRange(int n, int l, int r){
        
        //int k = r;
        for(int i = l; i<=r; i++){
            n = n ^ (1<<(i-1));
          //  k++;
        }
        System.out.println(n);
        
    }
	 
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++){
		    
		    int n = sc.nextInt();
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    
		    toggleBitsRange(n, l, r);
		}
	}
}
