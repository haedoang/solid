package ocp.domain;

import java.util.Objects;

/**
 * packageName : ocp
 * fileName : User
 * author : haedoang
 * date : 2022-01-19
 * description :
 */
public class User {
    private Long id;
    private String name;
    private String password;

    protected User() {
    }

    private User(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public static User of(Long id, String name,  String password) {
        return new User(id, name, password);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
