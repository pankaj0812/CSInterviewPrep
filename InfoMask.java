import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan = new Scanner(System.in);
        String email= scan.nextLine();
        String phone=scan.nextLine();
        String phone1=scan.nextLine();
        //System.out.println(email + " "+ phone+ " " + phone1);
        email=email.replaceAll("(\\w)(\\w+)(\\w{1,1})(@.*)","$1*****$3$4");
        phone=phone.replaceAll("[(\\s]","")
            .replaceAll("[)\\s]+","-")
            .replaceAll("\\d(?=(?:\\D*\\d){4})","*")
            .replaceAll("[()\\s]","")
            .replaceAll("\\b(\\d+)(\\d{3})(\\d{3})(\\d{4})","$1-$2-$3-$4")
            .replaceAll("\\d(?=(?:\\D*\\d){4})","*")
            .replaceAll("[()\\s]+","-");
        phone1=phone1.replaceAll("[()\\s]+","-").replaceAll("\\d(?=(?:\\D*\\d){4})","*");
        phone1=phone1.replaceAll("\\b(\\d+)(\\d{3})(\\d{3})(\\d{4})","$1-$2-$3-$4");                        
        phone1=phone1.replaceAll("\\d(?=(?:\\D*\\d){4})","*").replaceAll("[()\\s]+","-");
        
        System.out.println(email);
        System.out.println(phone);
        System.out.println(phone1);
        
    }
}
