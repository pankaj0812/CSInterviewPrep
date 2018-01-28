import java.io.*;
import java.util.*;

class GFG {
  public static void main(String[] args) throws Exception  {
   
     int[][] a =     {{00, 01, 02, 03, 04},
                     { 10, 11, 12, 13, 14},
                     {20, 21, 22, 23, 34},
                     {30, 31, 32, 33, 34},
                     {40, 41, 42, 43, 44}};
    printMatrix(a); 
    printMatrix(getRotatedImage(a));
    printMatrix(getRotatedImageinPlace(a));
    }
    
    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
    }
    
    public static int[][] getRotatedImage(int[][] a){
        int n = a.length;
        int res[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                res[i][j] = a[n-1-j][i];
            }
        }
    return res;        
    }
    
    public static int[][] getRotatedImageinPlace(int[][] a){
        int n = a.length;
        int temp =0;
        for(int i =0; i<n/2; i++){
            for(int j=i; j<n-1-i; j++){
                temp = a[i][j];
                a[i][j] = a[n-1-j][i];
                a[n-1-j][i] = a[n-1-i][n-1-j];
                a[n-1-i][n-1-j] = a[j][n-1-i];
                a[j][n-1-i] = temp;
            }
        }
        return a;
    }
}
