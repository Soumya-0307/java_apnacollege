class Floyds{
public static void main(String args[]){
    int n=5;
    int counter=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++)
        {
           System.out.print(counter + " ");
           counter++;
        }
        System.out.println();

    }
}
// 1
// 2 3      output
// 4 5 6
// 7 8 9 10

}