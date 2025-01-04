public class Spiral {

    public static void spiral_matrix(int matrix[][]){
        int startcol=0;
        int startrow=0;

        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while(startcol<=endcol && startrow<=endrow){

            // top
            for(int i=startcol;i<=endcol;i++){
                System.out.print(matrix[startrow][i]);
            }

            // right
            for(int j=startrow+1;j<=endrow;j++){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[j][endcol]);
            }

            ////bottom
            for(int i=endcol-1;i>=startcol;i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[endrow][i]);
            }

            // left
            for(int j=endrow-1;j>=startrow+1;j--){
                System.out.print(matrix[j][startcol]);
            }
           

            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }

       


        
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                    {13,14,15,16}};

                        spiral_matrix(matrix);

    }
}
