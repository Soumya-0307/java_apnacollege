package Arrays;
import java.util.*;
public class Basics {
    public static void main(String args[]){
        int marks[]=new int[30];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
         System.out.println("marks array length:"+marks.length);   
         marks[2]=marks[2]+4;
        System.out.println("the marks of the subject chem,phy,Maths respectively"+marks[0]+","+marks[1]+","+marks[2]);
        System.out.println("the percentage of the student is:"+((marks[0]+marks[1]+marks[2])/3)+"%");

        
        sc.close();

    }
    
    }

