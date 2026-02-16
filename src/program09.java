/*

9.  *********
     *******
      *****
       ***
        *
        
*/
public class program09 {
    public static void main(String[] args) {
        int n = 5;
        for(int row =0;row<n;row++){
            int totalCol = (2*n)-(2*row)-1;
            int noOfSpace = row;
            for(int space=0;space<noOfSpace;space++){
                System.out.print(" ");
            }
            for(int col=totalCol;col>0;col--){
                System.out.print("*");
            }
            for(int space=0;space<noOfSpace;space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
