package ocp.exam03.dao;

import ocp.domain.User;
import ocp.exam03.db.BConnectionMaker;
import ocp.exam03.db.ConnectionMaker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * packageName : ocp.exam03.dao
 * fileName : UserDaoTest
 * author : haedoang
 * date : 2022-01-19
 * description :
 */
class UserDaoTest {

    @Test
    @DisplayName("인터페이스 이용한 사용자 등록 테스트")
    public void userInsert() throws SQLException, ClassNotFoundException {
        // given
        ConnectionMaker conn = new BConnectionMaker();
        User user = User.of(3L, "김박사", "4556");

        // when
        UserDao userDao = new UserDao(conn);
        int actual = userDao.add(user);

        // then
        assertThat(actual).isEqualTo(1);
    }
}
