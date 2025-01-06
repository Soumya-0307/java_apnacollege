public class Sumsrow {

    public static void sum(int matrix[][],int rowno){
        int rowlen=matrix.length-1;
        int collen=matrix[0].length-1;
        int sum=0;

        for(int i=0;i<=rowlen;i++){
            if(i==rowno){
                for(int j=0;j<=collen;j++){
                     sum=sum+matrix[i][j];
                }
            }
        }
        System.out.println(sum);


    }
    public static void main(String args[]){


        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                         {9,10,11,12}};
                         sum(matrix, 1);
    }
}
