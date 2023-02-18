import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX5 {
    public static void main(String[] args) {
        int count = 0;
        String str = "Экспресс старт смотри";
        Pattern pattern = Pattern.compile("\\b((\\S*[Сс]\\S*){3})\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}

