package Introduction;
import java.util.*;
public class Leap_year {
static void leap(int n){
    if(n%4 == 0){
        if(n%100 != 0){
            System.out.println(n+" is leap year.");
        }
        else{
            if(n%100 == 0 && n%400 == 0){
            System.out.println(n+" is leap year.");
            }
            else{
            System.out.println(n+" is not a leap year.");
            }

        }
    }
    else{
        System.out.println(n+" is not a leap year.");

        }
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          leap(n);
          sc.close();
    }
}
