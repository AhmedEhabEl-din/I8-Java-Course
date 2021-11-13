import java.util.Scanner;

public class SumString {

    public static void main (String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int sum = 0;
        // 2+4-9
        // 456+7+3-5
        char operation = ' ';
        StringBuilder sb = new StringBuilder();
        int i;
        if(isNumber(line.charAt(0))){
            operation = '+';
            i=0;
        }
        else
            i=1;
            for (; i < line.length(); i++) {
            char element = line.charAt(i);
            for (int j = i; j < line.length() && isNumber(element) ; j++ ,i++) {
                   sb.append(element);
            }
            doOperation(sum, operation,Integer.parseInt(sb.toString()));
            operation = line.charAt(i);
        }
        System.out.println(sum);
        scanner.close();
    }

    public static boolean isNumber(char c){
        if(c>='0' && c<='9'){
            return true;
        }
        return false;
    }
    public static void doOperation (int sum,char operation ,int number){
            switch (operation){
                case '+' -> sum+=number;
                case '-' -> sum-=number;
                case '*' -> sum*=number;
                case '/' -> sum/=number;
            }
    }   
}
