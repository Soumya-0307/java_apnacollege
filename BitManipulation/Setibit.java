public class Setibit {
    public static void main(String args[]){
        int n=10;
        int i=2;
        System.out.println(n);


        int bitmask=1<<i;

        int set=n|bitmask;

        System.out.println(set);
    }
}
