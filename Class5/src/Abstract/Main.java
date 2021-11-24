package Abstract;

public class Main {
    public static void main(String[] args) {
        Something.say();
    }

     static class Something {
        public static void say() {
            System.out.println("Hey");
        }
    }
}
