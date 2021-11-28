public class StringPalindrome {

    public static void main(String[] args) {

        String s = "1223221";
        System.out.println(checkPalindrome(s) ? "String is palindrome" : "String is not Palindrome");
    }

    private static boolean checkPalindrome(String s) {
        if (s.length() <= 1)
            return true;
        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        return checkPalindrome(s.substring(1, s.length() - 1));
    }
}
