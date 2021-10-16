package Homwwork;

import java.util.Scanner;

public class Array16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        /*
         *  size = 10
         *   0 - 9
         *   09 18 27 36 45
         *  size = 7
         *   0 - 6
         *   06 15 24 33
         * */
        int m =0;
        if (n%2!=0) m++;
        //Math.round(n)
        for (int i = 0; i < (n+m) / 2; i++) {
            if (i==n-1-i){
                System.out.print(arr[i]);
            }else
                System.out.print(arr[i] +" "+arr[n-1-i]+" ");
        }
    }
}
