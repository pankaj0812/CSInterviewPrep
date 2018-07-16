/*package whatever //do not write package name here */

import java.io.*;

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];
    
    Stack(){
        top =-1;
    }
    
    boolean isEmpty(){
        return (top<0);
    }
    
    boolean push(int x){
        if(top>=(MAX-1)){
            System.out.println("Overflow");
            return false;
        }
        else {
            a[++top]=x;
            return true;
        }
    }
    
    int pop(){
        if(top<0){
            System.out.println("Underflow");
            return -1;
        }
        else{
            int x = a[--top];
            return x;
        }
    }
}

class GFG{	
    public static void main (String[] args) {
		Stack stk = new Stack();
		System.out.println(stk.pop());
		
	}
}
