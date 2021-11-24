import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

public class SumString {

    public static void main (String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println("Enter the line");
        int sum = 0;
        char operation = ' ';
        StringBuilder sb = new StringBuilder();
        int i;
        if(isNumber(line.charAt(0))){
            operation = '+';
            i=0;
        }else{
            operation = line.charAt(0);
            i=1;
        }
            for (; i < line.length(); i++) {
            for (int j = i; j < line.length() && isNumber(line.charAt(i)) ; j++ ,i++) {
                sb.append(line.charAt(i));
            }
            sum = doOperation(sum, operation,Integer.parseInt(sb.toString()));
            sb  = new StringBuilder();
            if(i<line.length())
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
    public static int doOperation (int sum,char operation ,int number){
            switch (operation){
                case '+': return sum+number;
                case '-': return sum-number;
                case '*': return sum*number;
                case '/': return sum/number;
                default: return sum; 
            }
    }   
}
