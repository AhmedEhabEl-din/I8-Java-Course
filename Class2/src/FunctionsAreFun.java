import java.io.File;
import java.io.FileWriter;

public class FunctionsAreFun {

    public String function1(){
        return null;
    }

    public static int sum(int x,int y){
        return x+y;
    }

    public static int sum(String x,String y){
        return Integer.parseInt(x) + Integer.parseInt(y);
    };

    public static void main(String[] args) {
        FunctionsAreFun fun = new FunctionsAreFun();
        System.out.println(sum(4, 6));


    }
}
