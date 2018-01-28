import java.io.*;
import java.util.*;

class GFG {
  public static void main(String[] args) throws Exception  {
   
     int[][] a =     {{1, 1, 0, 1},
                     { 1, 1, 1, 1},
                     {1, 0, 1, 1}};
                     
    printMatrix(a); 
    printMatrix(getEditedMatrix(a));
    }
    
    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
    }
    
    public static int[][] getEditedMatrix(int[][] a){
        boolean rows[] = new boolean[a.length];
        boolean cols[] = new boolean[a[0].length];
        
        
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(a[i][j]==0)
                    rows[i]=cols[j] = true;
                
            }
        }
        
          for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(rows[i] || cols[j])
                    a[i][j] = 0;
                
            }
        }
        
        return a;

    }
}
