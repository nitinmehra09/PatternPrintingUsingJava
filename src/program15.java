/*
15.      *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
*/

public class program15 {
    public static void main(String[] args) {
        int n =5;
        for(int row=0;row<2*n-1;row++){
            int currentRow = row<n?row:2*n-row-2;
            int noOfSpaceOut =  n - currentRow - 1;
            int noOfSpaceIn = 2 * currentRow - 1;
            for(int space=0;space<noOfSpaceOut;space++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int space=0;space<noOfSpaceIn;space++){
                System.out.print(" ");
            }
      // second star
            if (currentRow != 0) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
