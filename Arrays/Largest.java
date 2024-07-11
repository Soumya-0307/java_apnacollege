package Arrays;
// import java.util.*;
public class Largest {
    static int larg(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }

        }
    System.out.println("the minimum value marks is:"+smallest);

           return largest;
    }
    public static void main(String args[]){
      int marks[]={23,45,67,89,1,80};
      int high=larg(marks);
    System.out.println("the highest marks is:"+high);



    }
}
