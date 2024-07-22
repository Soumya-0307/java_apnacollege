package Arrays;

public class maxsubprefix {
    public static void maxsub(int arrays[]){
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;
        int prefix[]=new int[arrays.length];

        prefix[0]=arrays[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arrays[i];
        }
        for(int i=0;i<arrays.length;i++){
            int start=i;
            for(int j=i;j<arrays.length;j++){
                int end=j;
                cursum = start == 0 ? prefix[end]:prefix[end]-prefix[start-1];
                if(maxsum<cursum){
                    maxsum=cursum;
                }
            }
        }
        System.out.println("the largest sum of sub array is:"+maxsum);
    }
    public static void main(String args[]){
     int array[]={1,-2,6,-1,3};
      maxsub(array);
  

    }
}
