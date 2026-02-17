/*
14.  *********
      *     *
       *   *
        * *
         *
*/
public class program14 {
    public static void main(String[] args) {
        int n = 5;
        for(int row=0;row<n;row++){
            int noOfSpaceOut = row;
            int noOfSpaceIn = 2*n-2*row-3;
            for(int space=0;space<noOfSpaceOut;space++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int space=0;space<noOfSpaceIn;space++){
                if(row==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            if(row!=n-1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
