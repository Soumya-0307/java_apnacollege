public class Poweroftwo {
    public static void main(String args[]){
        int n=16;
        boolean res=(n&(n-1))==0;

        if(res){
            System.out.println("YES "+n+" is power of 2.");
        }else{
        
            System.out.println("NO "+n+" is not a power of 2.");

        }

    }
}
