// Java program to compare permutations of two strings using Hashtable

import java.util.*;
class csInterview
{

		public static void main(String[] args)
	{
	    Hashtable <Character,Integer> map = new Hashtable <Character,Integer>();
	    int flag=0;
	    String s1 = "ABBBBCCCCD" , s2 = "ABBBBDCCCC";
	    if (s1.length() == s2.length())
	    {
	         for (int i=0;i<s1.length(); i++)
	        {   
	            char key = s1.charAt(i);
	            if (map.containsKey(key))
	                { 
	                    map.put(key,map.get(key)+1);
	                }
	            else
            	    {
            	        map.put(key, 1);
            	    }
        	}
	for (int i=0;i<s2.length();i++)
		{  
		   char key2 = s2.charAt(i);
		   if (map.containsKey(key2))
		   {
		       if (map.get(key2)>0)
		       {
		           map.put(key2,map.get(key2)-1);
		       }
		       else
		       {
		           flag=1;
		           break;
		       }
		   }
		   else 
		   {
		       flag=1;
		       break;
		   }
	    }
	    System.out.println(map);
	    if (flag == 1)
	    {
	        System.out.println("not permute");
	    }
	    else
	    {
	        System.out.println("permute");
	    }
}
}
}
