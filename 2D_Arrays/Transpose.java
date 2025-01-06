import java.util.*;
public class Transpose {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

            System.out.println("enter the size of the matrix row:");
            int row=sc.nextInt();

            System.out.println("enter the size of the matrix col:");
            int col=sc.nextInt();

            int matrix[][]=new int[row][col];

            System.out.println("enter the elements one by one:");

            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }

            System.out.println("the matrix elements are:");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println("elements after transpose:");

            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                      System.out.print(matrix[j][i]+" ");
                    }
                    System.out.println();
            }


            sc.close();
    }
}
