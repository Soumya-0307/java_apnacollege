package Arrays;

public class BinarySearch {
    static int binary(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
        int mid=(start+end)/2;
        if(numbers[mid]==key){
            return mid;
        } 
        if(numbers[mid]>key){
            end = mid-1;
        }else{
            start=mid+1;
        }
    }

        return -1;
    }
    public static void main(String args[]){
        int marks[]={23,45,78,90,99,100};
        int key=89;
        int index=binary(marks,key);
        if(index == -1){
            System.out.println("element not found");
        }else{
            System.out.println("element found at the location:"+(index+1));
        }
    }
}
