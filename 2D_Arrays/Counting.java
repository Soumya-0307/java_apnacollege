public class Counting {

    public static void counts(int matrix[][],int no){
        int rowlen=matrix.length-1;
        int collen=matrix[0].length-1;
        int count=0;

        for(int i=0;i<=rowlen;i++){
            for(int j=0;j<=collen;j++){
                if(matrix[i][j]==no){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                         {5,6,7,8},
                        {7,8,9,10},
                        {7,11,18,19}};

                    counts(matrix, 7);
    
    }
}
