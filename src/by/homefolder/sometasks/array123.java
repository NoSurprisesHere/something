package by.homefolder.sometasks;

public class array123 {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        int[][] myarray = new int[x][y];
        for (int k = 0; k < x; k++) {
            for (int i = k; i < myarray[k].length - k; i++) {
                for (int j = k; j < myarray[i].length - k; j++) {
                    myarray[i][j] = k + 1;
                }
            }
        }
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {
                System.out.print(myarray[i][j] + " ");
            }
            System.out.println();
        }
    }
}