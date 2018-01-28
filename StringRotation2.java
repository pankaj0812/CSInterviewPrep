/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		String s1="waterbottle";
		String s2="erbottlewat";
		if (s1.length()==s2.length())
		{
		    boolean val=isSubstring(s1,s2);
		    if (val==true)
		    System.out.println("is a substring with rotation");
		    else
		    System.out.println("not a substring");
		    
		}
		else
		System.out.println("not substring");
	}
	public static boolean isSubstring(String s1, String s2)
	{
	    int firstch=s1.indexOf(s2.charAt(0));
	    String s3= s1.substring(0,firstch);
	    String s4= s1.substring(firstch);
	    s4=s4+s3;
	    if (s4.equals(s2))
	    return true;
	    else return false;
	}
}
