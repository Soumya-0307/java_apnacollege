// package 2D_Arrays;
import java.util.*;

public class Searching {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("found at the position:"+"("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("element not found.");
        return false;

    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int matrix[][]=new int[3][3];
   System.out.println("enter the 2d matrix:");
   int m=matrix.length,n=matrix[0].length;

   for(int i=0;i<m;i++)
   {
        for(int j=0;j<n;j++)
        {
                matrix[i][j]=sc.nextInt();

        }
   }

   System.out.println("The entered  2d matrix are:");

    for(int i=0;i<m;i++)
    {
            for(int j=0;j<n;j++)
            {
                   System.out.print(matrix[i][j]+" ") ;

            }
            System.out.println() ;

    }

    System.out.println("enter the searching element to finf the position:");
    int key=sc.nextInt();

    search(matrix,key);
       sc.close();
    }
    
}
