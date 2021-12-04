import java.util.Arrays;

public class CountSort {

    public static void main(String[] args) {

        // n
        // Time complexity n*2
        // Space complexity n,
        int[] arr = new int[]{2, 12, 7, 8, 3, 4, 8, 2};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 2, 12, 7, 8, 3, 4, 8, 2
     */
    private static void sortArray(int[] arr) {
        int min = getMin(arr);
        int max = getMax(arr);

        // 2 3 4 5 6 7 8 9 10 11 12
        // 2 1 1 0 0 3 2 0 0  0  1
        int[] temp = new int[max - min + 1];
        for (int j : arr) {
            temp[j - min]++;
        }

        int start = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0){
                arr[start] = i+min;
                start++;
                temp[i]--;
                i--;
            }
        }
    }

    private static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (max < j)
                max = j;
        }
        return max;
    }

    private static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (min > j)
                min = j;
        }
        return min;
    }
}
