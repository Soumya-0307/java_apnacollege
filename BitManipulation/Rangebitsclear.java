public class Rangebitsclear {
    public static void main(String[] args) {
        int n=10,i=2,j=4;

        int a=(~0)<<j+1;
        int b=(1<<i)-1;

        int bitmask=a|b;

        int result=n&bitmask;

        System.out.println(result);
    }
}
