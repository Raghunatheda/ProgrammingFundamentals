package email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    public boolean emailVerification() {
        String email = "abcgmail.com";
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        System.out.println(email + " : " + matcher.matches() + "\n");
        return false;
    }
}
