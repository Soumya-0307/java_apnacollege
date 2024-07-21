package Arrays;

public class Pairs {
    public static void  pairss(int arrays[]){
         for(int i=0;i<arrays.length;i++){
            for(int j=i+1;j<arrays.length;j++){
                System.out.print("("+arrays[i]+","+arrays[j]+")"+" ");
            }
            System.out.println();
         }
    }

    public static void main(String args[]){
        int arrays[]={2,4,6,8,10};
        pairss(arrays);

    }
    
}
