package Introduction;
import java.util.*;
public class DecBin {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int bin=0;
        int pow=0;
        int dec=sc.nextInt();
        while(dec>0){
            int rem=dec%2;
            bin =bin + rem*(int)Math.pow(10,pow);
            pow++;
            dec=dec/2;

        }
        System.out.println(bin);
        sc.close();
    }
}
