public class StringBracketsCircle {


    public static void main(String[] args) {

        String string1 = "(({[]})){}";
        String string2 = ")(())";
        String string3 = "[{]}";
        String string4 = "{[]}";
        String string5 = "{}[]()()";

        System.out.println(checkBrackets(string1));
        System.out.println(checkBrackets(string2));
        System.out.println(checkBrackets(string3));
        System.out.println(checkBrackets(string4));
        System.out.println(checkBrackets(string5));
        System.out.println(checkBrackets("))(("));
    }

    private static boolean checkBrackets(String s) {

        int open = 0;
        int close = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(')
                open++;
            if (c == ')')
                close++;
            if (close > open)
                return false;
        }
        return (open == close);
    }
}
