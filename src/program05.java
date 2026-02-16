/*
5.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
*/
public class program05 {
    public static void main(String[] args) {
        int n = 5;
        for(int row=0;row<(2*n);row++){
            int totalCol = row>n? ((2*n)-row) :row;
            for(int j=0;j<totalCol;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
