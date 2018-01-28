import java.io.*;
import java.util.*;

class GFG {
  public static void main(String[] args) throws Exception  {
    String s1 = "bane", s2= "bae";
    System.out.println(isOneEditAway(s1, s2));
        
    }
    
    public static boolean isOneEditAway(String s1, String s2){
        int size = Math.min(s1.length(), s2.length());
        for(int i=0; i<size; i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(s1.length()==s2.length())
                    //must be replace
                    return s1.substring(i+1).equals(s2.substring(i+1));
                else{
               // System.out.println(i);
                    if(s1.length()<s2.length())
                        return s1.substring(i).equals(s2.substring(i+1));
                    else if(s1.length()>s2.length())
                         return s2.substring(i).equals(s1.substring(i+1));
                 }
            }
            
            
        }
    return Math.abs(s1.length() - s2.length()) == 1;        

}
}
