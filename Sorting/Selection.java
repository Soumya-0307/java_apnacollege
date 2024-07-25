package Sorting;

public class Selection {
    public static void select(int arrays[]){
        for(int i=0;i<arrays.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arrays.length;j++){
                if(arrays[minpos]>arrays[j]){
                    minpos=j;
                }
            }

            int temp=arrays[minpos];
            arrays[minpos]=arrays[i];
            arrays[i]=temp;

        }
    }

    public static void printarray(int arrays[]){
        for(int i=0;i<arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }
    }
    public static void main(String args[]){
        int array[]={2,3,6,1,7,9,4};
        select(array);
        System.out.println("the sorted elements are:");
        printarray(array);

    }
}
