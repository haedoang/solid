package srp.domain;

/**
 * packageName : srp.domain
 * fileName : User
 * author : haedoang
 * date : 2022-01-13
 * description :
 */
public class User {
    private Long id;
    private String name;
    private Email email;

    public User(Long id, String name, Email email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
