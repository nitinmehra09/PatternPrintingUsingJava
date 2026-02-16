/*
12.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *

*/

public class program12 {
    public static void main(String[] args) {
        int n = 5;
        for(int row=0;row<2*n;row++){
            int totalCol = row<n?n-row : row-n+1;
            int noOfSpace = row<n?row:2*n-row-1;
            for(int space=0;space<noOfSpace;space++){
                System.out.print(" ");
            }
            for(int col=0;col<totalCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
