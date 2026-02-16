/*
6.       *
        **
       ***
      ****
     *****
*/
public class program06 {
    public static void main(String[] args) {
        int n =5;
        for(int row =0;row<n;row++){
            int totalCol = row+1;
            int noOfSpace = n - totalCol;
            for(int space=0;space<noOfSpace;space++){
                System.out.print(" ");
            }
            for(int col=0;col<totalCol;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
