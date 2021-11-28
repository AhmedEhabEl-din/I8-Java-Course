import java.util.Arrays;
import java.util.HashMap;

public class ArrayDuplicates {

    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,5,7,2,5,8,3};
        System.out.println(Arrays.toString(removeDuplicates(array)));
    }

    private static int[] removeDuplicates(int[] array) {
        String s = "";
        for (int i = 0; i <array.length ; i++) {
            if (!s.contains(String.valueOf(array[i])))
                s += array[i]+" ";
        }
        String[] sArray = s.trim().split(" ");
        int[] intArray = new int[sArray.length];
        for (int i = 0; i < sArray.length ; i++) {
            intArray[i] = Integer.parseInt(sArray[i]);
        }
        return intArray;
    }
}
