import java.util.Scanner;

public class String3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        for (int i = 0; i <line.length() ; i++) {
            char c = line.charAt(i);
            if (c >= '0' && c<='9' ){
                System.out.print(c+" ");
            }
        }
    }
}
