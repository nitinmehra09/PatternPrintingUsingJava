/*
13.      *
        * *
       *   *
      *     *
     *       *
    ***********
*/

public class program13{
    public static void main(String[] args) {
        int n = 5;
        for(int row=0;row<n;row++){
            // int totalCol =2*n-1;
            int noOfSpaceOut =n-row-1;
            int noOfSpaceIn =2*row-1;
            for(int space=0;space<noOfSpaceOut;space++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int space=0;space<noOfSpaceIn;space++){
                if(row==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            if(row!=0){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}