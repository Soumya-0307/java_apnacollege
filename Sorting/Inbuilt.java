package Sorting;
import java.util.Arrays;
import java.util.Collections;
public class Inbuilt {
    public static void main(String args[]){
   Integer arrays[]={5,8,2,3,9,1};
   Arrays.sort(arrays);
   for(int i=0;i<arrays.length;i++){
    System.out.print(arrays[i]+" "); 
   }
   System.out.println();

   System.out.println("arrays in reverse order:");
   Arrays.sort(arrays,Collections.reverseOrder());
   for(int i=0;i<arrays.length;i++){
    System.out.print(arrays[i]+" ");
   }

   System.out.println();

   System.out.println("arrays in reverse order with index:");
   Arrays.sort(arrays,0,4,Collections.reverseOrder());
   for(int i=0;i<arrays.length;i++){
    System.out.print(arrays[i]+" ");
   }


    }
}
