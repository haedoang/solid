package srp.utils;

import java.util.regex.Pattern;

/**
 * packageName : srp
 * fileName : EmailString
 * author : haedoang
 * date : 2022-01-13
 * description :
 */
public class EmailString {
    private static final Pattern EMAIL = Pattern.compile("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$");

    private EmailString() {
    }

    public static boolean isValidEmailString(String emailString) {
        return EMAIL.matcher(emailString).matches();
    }
}
