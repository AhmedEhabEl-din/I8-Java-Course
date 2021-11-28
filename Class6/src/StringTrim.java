public class StringTrim {

    public static void main(String[] args) {

        String s = "sljdfk  32jh32  jh234kj4   34      324";
        System.out.println(removeSpacingReplace(s));
        System.out.println(removeSpacingSplit(s));

    }

    private static String removeSpacingReplace(String s) {
        String tempS = s.replace("  "," ");
        if (tempS.equals(s))
            return s;
        return removeSpacingReplace(tempS);
    }

    private static String removeSpacingSplit(String s) {
        String[] arr= s.split(" +");
        String answer = "";
        for (String ss : arr) {
            answer += ss+" ";
        }
        return answer;
    }
}