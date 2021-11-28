import java.util.Arrays;
import java.util.Scanner;

public class LinearEquationSystemSolver {

    static int row;
    static int column;
    static int[][] matrix;

    public static void main(String[] args) {
        readMatrix();
    }

    // n * n+1
    private static void readMatrix() {
        Scanner scanner = new Scanner(System.in);
        row = scanner.nextInt();
        column = scanner.nextInt();
        matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static void solve() {


    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
