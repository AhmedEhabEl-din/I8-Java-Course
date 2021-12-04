import java.util.Arrays;

public class MultiplyMatrix {

    public static void main(String[] args) {

        int[][] mat1 = new int[][]{
                {2, 3, 4},
                {3, 7, 5}};
        int[][] mat2 = new int[][]{
                {2, 3, 4},
                {6, 6, 7},
                {3, 4, 5}};

        printMatrix(solve(mat1, mat2));
    }

    /*
     *   2 3 4     4 5
     *   6 8 10    7 8
     *             2 10
     * */
    private static int[][] solve(int[][] mat1, int[][] mat2) {

        if (mat1[0].length != mat2.length) return new int[][]{};

        int row = mat1.length;
        int column = mat2[0].length;

        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = multiply(mat1, mat2, i, j);
            }
        }

        return matrix;
    }

    private static int multiply(int[][] mat1, int[][] mat2, int i, int j) {
        int value = 0;
        for (int k = 0; k < mat2.length; k++) {
            value += mat1[i][k] * mat2[k][j];
        }
        return value;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
