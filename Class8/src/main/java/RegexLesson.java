import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLesson {

    public static void main(String[] args) {

        String sentence = "words are so magical they can change the world around us at anytime";
        String numbers = "123.555.1234 321-555-4321 123.3577-1234";

        String regex = "^\\d{3}[\\.-]\\d{3,4}[.-]\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numbers);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
