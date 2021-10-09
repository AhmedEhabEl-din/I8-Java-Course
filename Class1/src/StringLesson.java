public class StringLesson {

    public static void main(String[] args) {

        String string ;
        string = "we r Learning JAVA";
        System.out.println(string.toLowerCase());
        System.out.println(string);

        System.out.println(string.charAt(1));
        String[] a = string.split(" ");
        System.out.println(a.length);

        System.out.println(string.startsWith("we"));
        System.out.println(string.endsWith("a"));

        System.out.println(string.replace("r", "."));
        System.out.println(string.contains("we"));

    }
}
