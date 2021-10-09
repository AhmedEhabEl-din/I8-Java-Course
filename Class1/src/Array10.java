import java.util.Scanner;

public class Array10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n ;
        int[] a;

        n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i <n ; i+=2) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i = 1; i <n ; i+=2) {
            System.out.print(a[i]+" ");
        }

    }
}
