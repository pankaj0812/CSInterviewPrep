import java.io.*;
import java.util.*;

class GFG {
  public static void main(String[] args) throws Exception  {
    String s = "aaabbbccaa";
    System.out.println(getCompressedString(s));
        
    }
    
    public static String getCompressedString(String s){
         StringBuilder compStr = new StringBuilder("");
    char last = s.charAt(0);
    int count=1;
   // System.out.println(countTable + "last :" + last);
    
    for(int i=1; i<s.length(); i++){
        System.out.println("i : "+i);
        if(s.charAt(i)==last){
            //update count
            count++;
            System.out.println("count :" +count );

        }else if(s.charAt(i)!=last){
            
            compStr.append(""+count+last);
            count = 1;
          //  last = s.charAt(i);
            //count++;
            last = s.charAt(i);
            //System.out.println(count + "2 last :" + last + " char :" + s.charAt(i)+"\n");
        }
       // System.out.println(count + " last :" + last + " char :" + s.charAt(i)+"\n");
        if(i==s.length()-1)
            compStr.append(""+count+last);
        if(s.length()==compStr.length())
                   return s;

      
     
    }
      System.out.println("compressed "+compStr+"\n");
        return compStr.toString();

}
}
