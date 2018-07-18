/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++){
		    String s1 = sc.next();
		    String s2 = sc.next();
		    HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	        for(int k = 0; k<s1.length(); k++){
	            //if(hm.get(s1.charAt(k))==null)
	                hm.put(s1.charAt(k), 1);
	        }
	        for(int k=0; k<s2.length(); k++){
	            if(hm.get(s2.charAt(k))!=null){
	                hm.remove(s2.charAt(k));
	                System.out.println("removed " + s2.charAt(k));
	            }else{
	                hm.put(s2.charAt(k), 1);
	                System.out.println("add " + s2.charAt(k));

}
	        }
	        
	        Iterator iterator = hm.keySet().iterator();

	        while (iterator.hasNext()) {
                String key = iterator.next().toString();
                System.out.print(key);


	        }
	                                        System.out.println("key");


	
	
		}
	}
}
