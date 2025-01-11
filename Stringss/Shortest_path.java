// import java.util.*;
public class Shortest_path {

    public static void shortest(String str){
        int x1=0;
        int y1=0;
        int x2=0;
        int y2=0;

        int n=str.length();
        for(int i=0;i<=n-1;i++){
            if(str.charAt(i)=='W'){
                x2=x2-1;
            }
            if(str.charAt(i)=='E'){
                x2=x2+1;
            }
            if(str.charAt(i)=='N'){
                y2=y2+1;
            }
            if(str.charAt(i)=='S'){
                y2=y2-1;
            }
        }

        System.out.println("x1=" +x1+ "  y1="+y1);
        System.out.println("x2=" +x2+ "  y2="+y2);


        float result=(float)Math.sqrt((x2-x1)*(x2-x1) +(y2-y1)*(y2-y1));
        System.out.println("the shortest distance between two points is:"+result);



       



    }

    public static void main (String args[]){
        String str="SN";

        shortest(str);

    }
}
