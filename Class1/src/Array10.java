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
            if (a[i]%2 == 0)
                System.out.print(a[i]+" ");
        }
       System.out.println();
        /*
            неправельно решил во время занятитя
            for (int i = 1; i <n ; i+=2) {
                System.out.print(a[i]+" ");
            }
        */

        /*
             вот суда исправел так как порядок должен быть убывантим их индексов
             и ещё проверяю чётный ли этот номер
        */
        int m = n;
        if (n%2!=0) m--;
        for (int i = m-1; i >=1 ; i-=2) {
            if (a[i]%2 != 0)
                System.out.print(a[i]+" ");
        }
    }
}
