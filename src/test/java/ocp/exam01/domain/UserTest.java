package ocp.exam01.domain;

import ocp.domain.User;
import ocp.exam01.dao.UserDao;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * packageName : ocp
 * fileName : UserTest
 * author : haedoang
 * date : 2022-01-19
 * description :
 */
class UserTest {

    @Test
    @DisplayName("사용자 객체 비교하기")
    public void userEquals() {
        // given
        User user = User.of(1L, "haedoang", "1234");

        // then
        assertThat(user).isEqualTo(User.of(1L, "haedoang", "1234"));
    }


    @Test
    @DisplayName("사용자 등록")
    public void insertUser() throws SQLException, ClassNotFoundException {
        // given
        User user = User.of(1L, "haedoang", "1234");
        UserDao userDao = new UserDao();

        // when
        int result = userDao.add(user);

        // then
        assertThat(result).isEqualTo(1);
    }
}
