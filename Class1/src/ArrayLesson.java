import java.util.Arrays;

public class ArrayLesson {

    public static void main(String[] args) {

        String lines[] = new String[10];
        // 1 -> 10
        String[][] twoDArray = new String[5][10];
        /*  1 2 3 4 5 6 7 8 9 10
         * 1
         * 2
         * 3
         * 4
         * 5
         * */
        int[] numbers = new int[10];
        for (int i = 0; i <10 ; i++) {
            lines[i] = String.valueOf(i);
        }
        for (int i = 0; i <10 ; i++) {
            System.out.print(lines[i]+" ");
        }
        System.out.println(Arrays.toString(lines));


    }
}
