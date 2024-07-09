package Introduction;
import java.util.*;
public class BinDec {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int bin=sc.nextInt();
     int pow=0;
     int decnum = 0;
     while(bin > 0){
        int lastdigit=bin%10;
        decnum= decnum+(lastdigit*(int)Math.pow(2,pow));
        pow++;
        bin=bin/10;

     }
     System.out.println(decnum);

     sc.close();
    }
}
