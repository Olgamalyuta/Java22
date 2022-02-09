package Task1_10;

public class Task1_10 {
    public static void main(String[] args) {
        int n = 6;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++){
            int m=n;
            for (int j = 0; j < n; j++){
                if (i % 2 == 0) array[i][j] = j + 1;
                else {
                    array[i][j] = m;
                    m--;
                }}}

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}