/*
Pascal’s Triangle
16.           1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1

*/
public class program16 {
    public static void main(String[] args) {
        int n =5;
        for(int row=0;row<n;row++){
            int noOfSpace = 2*n-2*row;
            for(int space=0;space<noOfSpace;space++){
                System.out.print(" ");
            }
            int value = 1;
            for(int col = 0;col<=row;col++){
                System.out.print(value + "   ");
                value = value * (row - col) / (col + 1);
            }
            System.out.println();
        }
    }
}


// public static void main(String[] args) {
//         int n =5;
//         for(int row=0;row<n;row++){
//             int totalCol = row+1;
//             int noOfSpace = 2*n-2*row;
//             for(int space=0;space<noOfSpace;space++){
//                 System.out.print(" ");
//             }
//             int value = 1 ;
//             for(int col = 0;col<=row;col++){
//                 System.out.print(value + "   ");
//                 value = value * (row - col) / (col + 1);
//             }
//             System.out.println();
//         }
//     }