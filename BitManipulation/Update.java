public class Update {
    public static void main(String args[]){
           int n=10;
           int i=2;
           int newbit=1;

           n=n & (~(1<<i));
           int bitmask=newbit<<i;
           System.out.println(n|bitmask);
    }
}
