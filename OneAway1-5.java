import java.io.*;

class GFG {
	public static void main (String[] args)
	{
	    boolean value;
		String s1="pale",s2="bake";
		s1 = s1.toLowerCase();s2 = s2.toLowerCase();
		if (s1.equals(s2))
		{
		    value=true;
            System.out.println(value);
		}
        else if (s1.length() == s2.length())
		{
		    value=equallength(s1,s2);
		    System.out.println(value);
		}
		else if (s1.length()-s2.length()<=1)
		{
		    value=unequallength(s1,s2); 
		    System.out.println(value);
		}
		else System.out.println(false);
	}
	public static boolean equallength(String s1, String s2)
    {   
        int count=0,flag=0;
        StringBuilder sb1 = new StringBuilder();
        sb1.append(s1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(s2);
        int len=s1.length(); 
        for (int i=0;i<len;i++)
            {
                if (sb1.charAt(i) != sb2.charAt(i) && count<1) 
                {
                    sb2.setCharAt(i, sb1.charAt(i));
                    count++;
                 } 
                 
            }
        if (sb1.toString().equals(sb2.toString()))
        return true;
        else
        return false;
    }
    public static boolean unequallength(String s1, String s2)
    {
        int count=0,flag=0;
        StringBuilder sb1 = new StringBuilder();
        sb1.append(s1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(s2);
        int len=s1.length();
        for (int i=0;i<len-1;i++)
        {
            if (i<sb2.length()-1)
            {
                if (sb1.charAt(i) != sb2.charAt(i) && count<1) 
                    {
                        sb2.insert(i, sb1.charAt(i));
                        count++;
                     }
            }
            else if (i==sb2.length()-1)
                {
                    sb2.append(sb1.charAt(i+1));
                }
        }
        if (sb1.toString().equals(sb2.toString()))
        return true;
        else
        return false;
    }
}
