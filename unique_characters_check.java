import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
    Hashtable <Integer,String> map = new Hashtable<Integer,String>();
    String word="abcd";
    int l=word.length();
    int flag =0;
    for (int i=0;i<l;i++)
    {
        char ass = word.charAt(i);
        int ascii = (int)ass;
        //map.put(Character.getNumericValue(word.charAt(i)), String.valueOf(ass));
        if(map.get(ascii)==null){
        map.put(ascii, String.valueOf(ass));
        } else{
           System.out.println("No brooo");
           flag=1;
           break;
        }
        
        
        
    }
    if(flag==0){
        System.out.println(map);
    }
		
	}
}
