import java.io.*;
import java.util.*;

class GFG {
  public static void main(String[] args) throws Exception  {
   
    String s1="waterbottle", s2="erbottlewat";
                     
    System.out.println(isSubstring(s1, s2)); 
    }
    
    public static boolean isSubstring(String s, String t){
           StringBuilder newString = new StringBuilder();
           if(s.length()==t.length()){
           int charIndex = s.indexOf(t.charAt(0));
           newString = newString.append(s.substring(charIndex)).append(s.substring(0, charIndex));
       }
        return newString.toString().equals(t);

    }
    
   
}
