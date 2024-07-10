package Arrays;
// import java.util.*;
public class LinearSearch {
   public static int linear(int array[],int key){
        for(int i=0;i<array.length;i++){
            if(array[i] == key){
               return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
          int items[]={34,67,89,98,90,89,77};
          int keys=37;
        int index=linear(items,keys);
            if(index == -1){
                System.out.println("element not found:");
            }else{
                System.out.println("element found at the location:"+(index));
            }
    }
}
