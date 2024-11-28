package Sorting;
import java.util.*;

public class Bubble {
    public static void Bubbl(int arrays[]){
        for(int i=0;i<arrays.length;i++){
            int swap=0;
            for(int j=0;j<arrays.length-1-i;j++){
                if(arrays[j]>arrays[j+1]){
                    int temp=arrays[j];
                    arrays[j]=arrays[j+1];
                    arrays[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
    }
    public static void printarray(int arrays[]){
        for(int i=0;i<arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }
    }

    public static void main(String args[]){
     int i;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number of elements");
     int n=sc.nextInt();

     int[] array=new int[n];


     System.out.println("enter the array elements");
     for(i=0;i<n;i++){
       array[i]=sc.nextInt();   
         }

          Bubbl(array);
              System.out.println("the sorted elemnts are:");
                    printarray(array);


    sc.close();

    }

}
