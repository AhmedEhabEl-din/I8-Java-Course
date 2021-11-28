public class StringBrackets {

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

        System.out.println();

        System.out.println(checkBracketsReplace(string1));
        System.out.println(checkBracketsReplace(string2));
        System.out.println(checkBracketsReplace(string3));
        System.out.println(checkBracketsReplace(string4));
        System.out.println(checkBracketsReplace(string5));

    }

    private static boolean checkBrackets(String string) {
        return true;
    }

    private static boolean checkBracketsReplace(String string) {
        String tempS;
        tempS = string.replace("{}", "");
        tempS = tempS.replace("()", "");
        tempS = tempS.replace("[]", "");
        if (tempS.equals(string))
            return tempS.isEmpty();
        return checkBracketsReplace(tempS);
    }

    // for Stack
    private static boolean isOpen(char c) {
        return (c == '{' || c == '[' || c == '(');
    }
}
