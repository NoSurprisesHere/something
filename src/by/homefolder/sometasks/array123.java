package by.homefolder.sometasks;

public class array123 {
    public static void main(String[] args) {
        int x = 15;
        int y = 15;
        int[][] myarray = new int[x][y];
        for (int k = 1; k < x; k++) {
            for (int i = k - 1; i < myarray.length - k + 1; i++) {
                for (int j = k - 1; j < myarray.length - k + 1; j++) {
                    myarray[i][j] = k;
                }
            }
        }
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray.length; j++) {
                System.out.print(myarray[i][j] + " ");
            }
            System.out.println();
        }
    }
}