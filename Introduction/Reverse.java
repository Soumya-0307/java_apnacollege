package Introduction;
import java.util.*;

public class Reverse {
    public static void main(String args[]){
        int rev=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int last = n%10;
             rev=(rev*10)+last;
             n=n/10;

        }
           System.out.println(rev);
           sc.close();
    }
}
