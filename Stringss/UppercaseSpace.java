// import java.util.*;
public class UppercaseSpace {
    public static void uppercase(String str){
        StringBuilder sb=new StringBuilder();
        int n=str.length();

        for(int i=0;i<n;i++){

           if(i==0)
           {
                char ch1=str.charAt(i);
                char ch2=Character.toUpperCase(ch1);
                sb.append(ch2);
           }
           
             else if(str.charAt(i) == ' ' && i<n-1)
             {
                sb.append(str.charAt(i));
                i++;
                char ch3=str.charAt(i);
                char ch4=Character.toUpperCase(ch3);
                sb.append(ch4);
             }
             else
             {
             sb.append(str.charAt(i));
             }
           
        }

        System.out.println(sb.toString());
            
    }

    public static void main(String[] args) {
        String str="hii i am SOUMYA  ";
        int n=str.length();
        System.out.println(n);
        uppercase(str);
    }
}
