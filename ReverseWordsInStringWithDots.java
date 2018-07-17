/*
                  
Given a String of length N reverse the whole string without reversing the individual words in it. Words are separated by dots.

Input:
The first line contains T denoting the number of testcases. Then follows description of testcases. Each case contains a string containing spaces and characters.

Output:
For each test case, output a single line containing the reversed String.

Constraints:
1<=T<=20
1<=Lenght of String<=2000


Example:
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t= sc.nextInt();
		for(int i=0; i<t; i++){
		    String s = sc.next();
		    String arr[] = s.split("\\.");
		    System.out.print(Arrays.toString(arr));
		    int n = arr.length;
		    int j;
		    for(j=n-1; j>0; j--){
		        System.out.print(arr[j] + ".");
		    }
		    System.out.println(arr[j]);

		}
	}
}
