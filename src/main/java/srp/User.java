package srp;

import java.util.regex.Pattern;

/**
 * packageName : srp
 * fileName : User
 * author : haedoang
 * date : 2022-01-13
 * description :
 */
public class User {
    private static Pattern EMAIL = Pattern.compile("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$");
    private Long id;
    private String name;
    private String email;

    public User(Long id, String name, String email) {
        validateEmail(email);
        this.id = id;
        this.name = name;
        this.email = email;
    }

    private void validateEmail(String email) {
        if(!EMAIL.matcher(email).matches()) {
            throw new IllegalArgumentException("이메일 형식이 아닙니다.");
        }
    }

    public void sendMail() {
        System.out.println("send Mail by" + email);
    }
}
