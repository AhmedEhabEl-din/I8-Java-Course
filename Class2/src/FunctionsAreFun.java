public class FunctionsAreFun {

    public String function1(){
        return null;
    }

    public static int sum(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {
        FunctionsAreFun fun = new FunctionsAreFun();
        System.out.println(sum(4, 6));
    }
}
