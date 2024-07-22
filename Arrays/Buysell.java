package Arrays;

public class Buysell {
    public static void profit(int arrays[]){
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0;i<arrays.length;i++){
            if(buyprice<arrays[i]){
                int profit=arrays[i]-buyprice;
                maxprofit=Math.max(profit,maxprofit);
            }else{
                buyprice=arrays[i];

            }
        }

        System.out.println("the maximum profit is:"+maxprofit);
    }
    public static void main(String[] args) {
        int prices[]={7,1,3,4,6,4};
        profit(prices);
    }
}
