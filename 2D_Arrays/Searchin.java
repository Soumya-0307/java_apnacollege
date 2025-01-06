public class Searchin {
public static boolean search(int matrix[][],int key){
    int row=0;
    int col=matrix[0].length-1;

    while(row<matrix[0].length && col>=0){
        if(key==matrix[row][col]){
            System.out.println("key found at the position: "+ "(" +row+","+col+")");
            return true;
        }
        else if(key<matrix[row][col]){
            col--;
        }
        else{
            row++;
        }
    }
return false;

}

// it is the staircase search in 2d_array;
// having the time complexity of 0(m+n);

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

search(matrix, 16);

    }
}
