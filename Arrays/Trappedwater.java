package Arrays;

public class Trappedwater {
    public static void traped(int arrays[]){
        int n= arrays.length;
        // left auxilary array
        int leftauxi[]=new int[n];
        leftauxi[0]=arrays[0];
        for(int i=1;i<n;i++){
            leftauxi[i]=Math.max(arrays[i],leftauxi[i-1]);
        }
        // right auxilary array
        int rightauxi[]=new int[n];
        rightauxi[n-1]=arrays[n-1];
        for(int i=n-2;i>=0;i--){
            rightauxi[i]=Math.max(arrays[i],rightauxi[i+1]);
        }


        // loop
        int trapedwater=0;
        for(int i=0;i<n;i++){
            // waterlevel findings
            int waterlevel =Math.min(leftauxi[i],rightauxi[i]);

            trapedwater += waterlevel-arrays[i];
        }
        System.out.println("the total trapped water is:"+trapedwater);
    }
    public static void main(String args[]){
        int building[]={4,2,0,6,3,2,5};
        traped(building);

    }
}
