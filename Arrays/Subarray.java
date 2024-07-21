package Arrays;

public class Subarray {
    public static void sub(int arrays[]){
        int t=0;
          for(int i=0;i<arrays.length;i++){
            int start=i;
            for(int j=i;j<arrays.length;j++){
                  int end=j;
                  for(int k=start;k<=end;k++){
                    System.out.print(arrays[k]+" ");
                    
                  }
                  System.out.print("  ");
                  t++;
            }
            System.out.println();
          }
          System.out.println("the total sub arrays:"+t);
    }
    public static void main(String args[]){
      int numbers[]={2,4,6,8,10};
        sub(numbers);

    }
}
