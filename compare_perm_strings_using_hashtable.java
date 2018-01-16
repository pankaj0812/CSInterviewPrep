// Java program to compare permutations of two strings using Hashtable

import java.util.*;
class csInterview
{

	public static void main(String[] args)
	{
	    int flag = 0;
	    String s1 = "DFAB", s2 = "ABFD";
	    
	    
	    if(s1.length() == s2.length()){
	        
	       Hashtable<Character, Integer> map = new Hashtable<Character, Integer>();
	    
	       for(int i=0; i<s1.length(); i++)
	        {
	            char key = s1.charAt(i);
	           if(map.containsKey(key))
	                map.put(key, map.get(key)+1);
	            else
	               map.put(key, 1);
	           }
	           	        System.out.println(map);

	    
	        for(int i=0; i<s2.length(); i++){
	            char key = s2.charAt(i);
	            if(map.containsKey(key)){
	                if(map.get(key)>0)
	                    map.put(key, map.get(key)-1);
	                else{
	                     flag = 1;
	                    break;
	                   
	                }
	            }
	           
	        } 
	         System.out.println(map + " " + flag);
	    
	    }
	    
	}
}
