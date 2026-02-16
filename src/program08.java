/*
8.      *
       ***
      *****
     *******
    *********
*/

public class program08 {
    public static void main(String[] args) {
        int n = 5;
        for(int row =0;row<n;row++){
            int totalCol = 2*row+1;
            int noOfSpace = n-row-1;
            for(int space=0;space<noOfSpace;space++){
                System.out.print(" ");
            }
            for(int col=0;col<totalCol;col++){
                System.out.print("*");
            }
            for(int space=0;space<noOfSpace;space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
