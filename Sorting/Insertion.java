package Sorting;
public class Insertion {
    public static void Insert(int arrays[]){
        for(int i=1;i<arrays.length;i++){
            int curr=arrays[i];
            int prev=i-1;
            // finding the currect position to insert the element
            while(prev>=0 && arrays[prev]>curr){
              arrays[prev+1]=arrays[prev];
              prev--;
            }
            // insert in the currect position.
            arrays[prev+1]=curr;
        }
    }

    public static void printarray(int arrays[]){
        for(int i=0;i<arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }
    }

    public static void main(String args[]){
        int arrays[]={2,7,9,8,4,1,};
        Insert(arrays);
        System.out.println("arrays after sorted:");
        printarray(arrays);

    }
}
