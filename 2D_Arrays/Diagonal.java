
public class Diagonal {

    public static int diagonal_sum(int matrix[][]){
        int collen=matrix[0].length-1;
        int rowlen=matrix.length-1;

        int sum=0;

        for(int i=0;i<=rowlen;i++){
            for(int j=0;j<=collen;j++){
                if(i==j){
                    sum=sum+matrix[i][j];
                }

               else if(i+j == matrix.length-1){
                    sum=sum+matrix[i][j];
                }
            }
        }


        return sum;



    }

    public static void main(String args[]){

     int matrix[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};

                 System.out.println(diagonal_sum(matrix));

    }
}
