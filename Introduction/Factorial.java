package Introduction;
import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int f=1;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.print("factorial of a number is:"+f);
        sc.close();
    }
}
