import java.io.*;
import java.util.*;

class GFG {
 public static void main(String args[]) {
       int a[] = new int[]{16, 17, 4, 3, 5, 2};
        int size = a.length;
        findLeaders(a, size);
    }
    
 public static void findLeaders(int arr[], int size){
        int max_right = arr[size-1];
        System.out.println(max_right+ " ");
        for(int i=size-2; i>0; i--){
            if(max_right<arr[i]){
                    max_right = arr[i];
                    System.out.println(max_right+ " ");
            }
        }
    }
    
   
}

// Complexity -> O(n)
