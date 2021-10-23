public class LessonFunction {

    public static int factorialLoop(int x) {
        int answer = 1;
        for (int i = x; i > 0; i--) {
            answer = i * answer;
        }
        return answer;
    }

    public static int factorialRecursion(int x) {
        if (x < 0){
            System.err.println("Number less than 1");
            return -1;

        }
        if (x == 1)
            return 1;
        else
            return x * factorialRecursion(x - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorialRecursion(5));
        System.out.println(factorialLoop(5));
    }
}
