import java.io.*;
import java.util.*;

class GFG {
  public static void main(String[] args) throws Exception  {
    String s = "abbccaaaaaaa";
    System.out.println(getCompressedString(s));
        
    }
    
    public static String getCompressedString(String s){
         StringBuilder compStr = new StringBuilder("");
    char last = s.charAt(0);
    int count=1;
    for(int i=1; i<s.length(); i++){
        if(s.charAt(i)==last){
            //update count
            count++;
        }else if(s.charAt(i)!=last){
            if(count>1)
                 compStr.append(""+count+last);
            else
                compStr.append(""+last);
            count = 1;
            last = s.charAt(i);
        }
        if(i==s.length()-1)
            compStr.append(""+count+last);
        if(s.length()==compStr.length())
                   return s;  
    }
        return compStr.toString();
  }
}
