package Arrays;

public class maxsubbrute {
    static void maxsub(int arrays[]){
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;
        for(int i=0;i<arrays.length;i++){
            int start=0;
            for(int j=i;j<arrays.length;j++){
                int end=j;
                cursum=0;
                for(int k=start;k<=end;k++){
                    cursum=cursum+arrays[k];                    
                }
                System.out.print(cursum);
                System.out.print(" ");
                if(cursum>maxsum){
                    maxsum=cursum;
                }
            }
            System.out.println();
        }
        System.out.println("the maximum sum of an sub array is:"+maxsum);
        
    }
    public static void main(String args[]){
        int numbers[]={2,3,-1,7,-8};
        maxsub(numbers);



    }
    
}
