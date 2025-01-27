public class Fastexpo {
    public static void main(String[] args) {
        int n=5,a=3;
        int ans=1;
        while(n>0){
            if((n&1)==1){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        System.out.println(ans);
    }
}
