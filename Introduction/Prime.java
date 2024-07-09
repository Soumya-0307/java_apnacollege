package Introduction;
import java.util.*;

public class Prime {

    static void prime(int n){
        boolean isprime=true;     //initially assumes prime
        if(n==2){
            isprime=true;      //special condition for 2
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                   isprime = false;   //divisible by any number then it is not a prime.
                   break;
                }
            }
        }
        if(isprime == false){
            System.out.println(n+"is not a prime number");
        }
        else{
            System.out.println(n+"is prime number");

        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime(n);
       
        sc.close();

    }
}
