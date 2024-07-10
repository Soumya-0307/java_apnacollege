package Arrays;

public class Pass {
    static void update(int marks[],int nochanges){
        for(int i=0;i<=marks.length;i++){
            marks[i]=marks[i]+nochanges;
            System.out.println("the updated marks is:"+marks[i]);

        }
    }
    public static void main(String args[]){
        int mark[]={80,82,89};
        int nochange=5;
        update(mark,nochange);



    }
}
