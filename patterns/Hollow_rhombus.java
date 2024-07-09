public class Hollow_rhombus {
    public static void main(String args[]){
        for(int i=1;i<=8;i++){
            for(int j=1;j<=(8-i);j++){
                  System.out.print(" ");
            }
                  for(int j=1; j<=8;j++){
                    if(j==1 || j == 8 || i==1 || i==8){
                        System.out.print("*");
                    } else
                    {
                        System.out.print(" ");
                    }
                  
            }
            System.out.println();
        }
    }
}
