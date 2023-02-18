import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex7 {
    public static void main(String[] args) {
        String str = "Анна поехала в Анталию одна";
        Pattern pat = Pattern.compile("\\b[Аа][А-Яа-я]*[Аа]*\\b|\\b[Аа]\\b");
        Matcher mat = pat.matcher(str);
        System.out.println(mat.find());
    }
}
