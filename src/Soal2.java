import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Soal2 {
    private static final String USERNAME = "^[a-z]{5}[_.]{1}[A-Z]{2}$";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main(String[] args) throws IOException {
        UsernameValidator("khoir.AK");
    }

    private static void UsernameValidator(String s) {
        pattern = Pattern.compile(USERNAME);
        matcher = pattern.matcher(s);
        if (matcher.matches()) {
            System.out.println("Username Valid");
        } else {
            System.out.println("Username tidak valid.");
        }
    }
}
