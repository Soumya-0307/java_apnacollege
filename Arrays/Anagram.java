package Arrays;
// import java.util.*;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        int slen=s.length();
        int tlen=t.length();
        char[] sarray=new char[slen];
        char[] tarray=new char[tlen];

        while(slen==tlen)
        {

           for(int i=0;i<slen;i++)
           {
                sarray[i]=s.charAt(i);
           }
            for(int i=0;i<tlen;i++)
            {
            tarray[i]=t.charAt(i);
            }

           if(sarray.equals(tarray))
           {
            return true;
           }
        }
        return false;
    }
    public static void main(String args[]){
        isAnagram("car","acr");
    }
}
    

