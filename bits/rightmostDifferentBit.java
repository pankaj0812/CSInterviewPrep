/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static void checkDifferentBits(int n, int m){
        if(n==0 || m ==0)
            System.out.println(0);
        else{
            int c=0;
            int x = m ^ n;
            while((x&(1<<c))==0)
                c++;
            System.out.println(++c);
        }
        
    }
    
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++){
		    
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    
		    checkDifferentBits(n, m);
		}
	}
}
