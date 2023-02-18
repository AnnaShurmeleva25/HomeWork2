import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex8 {
    public static void main(String[] args) {
        String str = "Карта № (5555-8765-0987-3214) активирована";
        Pattern pattern = Pattern.compile("\\b(\\d{4}-){3}\\d{4}\\b");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

