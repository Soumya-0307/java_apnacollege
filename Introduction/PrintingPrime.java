package Introduction;
import java.util.*;
public class PrintingPrime {

    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    System.out.println("prime from 2 to"+n+" are:");

    for(int num=2;num<=n;num++){
        boolean isprime=true;
        for(int div=2;div<=Math.sqrt(num);div++){
            if(num%div==0){
                isprime=false;
                break;
            }
        }
          if(isprime){
            System.out.println(num);
           }  
    }
    sc.close();
    }
}
