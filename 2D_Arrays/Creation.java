// package 2D_Arrays;
import java.util.*;
public class Creation {

    public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int matrix[][]=new int[3][2];
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


   sc.close();

    }
    
}
