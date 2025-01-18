public class BitEvenOdd {
    public static void main(String[] args) {
        int n=001100;
        int bitmask=1;

        if((n & bitmask) == 0){
                System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
