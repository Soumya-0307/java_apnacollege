package Introduction;
import java.util.*;
public class palindrome {
    public static void main(String args[]){
        int rev=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int numm=num;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
        if(numm==rev){
            System.out.println(numm+" is a palidrome.");
        }else{
            System.out.println(numm+" is not  a palidrome.");

        }
      sc.close();
    }
}
