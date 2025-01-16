public class Compress {
    public static void compress(String str){
         int n=str.length();
         String newstr="";


         for(int i=0;i<n;i++){
         Integer count=1;
             
            while(i<n-1  && str.charAt(i) == str.charAt(i+1) ){
                count++;
                i++;
            }
            newstr+= str.charAt(i);
                if(count>1){
                    newstr += count.toString();
                }
         }

         System.out.println("The compressed string is: "+newstr);
        
    }

    public static void main(String[] args) {
        String str="aaabbcccdd";
        System.out.println("The given string is: "+str);
        compress(str);

    }
}
