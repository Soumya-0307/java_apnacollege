public class Clear {
    public static void main(String args[]){
        int n=10;
        int i=1;

        int bitmask=~(1<<i);

        int clear=n&bitmask;
        System.out.println(clear);

    }
}
