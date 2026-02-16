/*
10.      *
        * *
       * * *
      * * * *
     * * * * *
*/
public class program10 {
    public static void main(String[] args) {
        int n = 5 ;
        for(int row =0;row<=n;row++){
            int totalCol = row;
            int noOfSpace = n-row;
            for(int space=0;space<noOfSpace;space++){
                System.out.print(" ");
            }
            for(int col=totalCol;col>0;col--){
                System.out.print("* ");
            }
            for(int space=0;space<noOfSpace;space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
