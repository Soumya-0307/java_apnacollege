package Arrays;

public class maxsubkadens {
    public static void kadens(int array[]){
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            cursum=cursum+array[i];

// update maxsum if cursum is greater then maxsum.this case is for all the numbers in the array becomes negative.
            if(maxsum<cursum){
                maxsum=cursum;
            }

 // if curent sum is negative then it is set 0. according to kadens algorithm.
            if(cursum<0){
                cursum=0;
            }
        }
        System.out.println("the maximum sub array sum is:"+maxsum);
    }
    public static void main(String args[]){
       int array[]={-2,-3,4,-1,-2,1,5,-3};
       kadens(array);
    }
}
