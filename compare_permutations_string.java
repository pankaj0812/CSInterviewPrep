// Java program to demonstrate difference between String,
// StringBuilder and StringBuffer

import java.util.*;
class csInterview
{

	public static String sortString(String str)
	{
	    char tempArray[] = str.toCharArray();
	    Arrays.sort(tempArray);
	    return new String(tempArray);
	}

	public static void main(String[] args)
	{
	    String s1 = "ABCD" , s2 = "ADCC";
	    s1 = sortString(s1);
	    s2 = sortString(s2);
	    
	    if(s1.compareTo(s2)==0){
	    System.out.println(s1 + " " + s2 );
	    }
	    else
	    	    System.out.println("Not a permutation" );

	}
}
