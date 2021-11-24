import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorHandling {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Started");

        while(true){
            scanner =new Scanner(System.in); 
            try{
                int number = scanner.nextInt();
                System.out.println(number);
                break;
            }catch(InputMismatchException e){
                System.out.println(e.toString()); 
            }    
        }
        System.out.println("Program Finished");
        
        scanner.close();
    }
}
