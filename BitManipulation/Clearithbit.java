public class Clearithbit {
    public static void main(String args[]){
        int n=15;
        int i=2;

        int bitmask=(~0)<<i;

        int result=n & bitmask;

        System.out.println(result);

        /*   after clearing the last i=2 bit in n=15(1111)  
           the o/p will be 10(1100) put zero in the last two(i) bits.*/

    }
}
