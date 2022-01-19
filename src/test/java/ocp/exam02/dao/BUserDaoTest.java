package ocp.exam02.dao;

import ocp.domain.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * packageName : ocp.exam02.dao
 * fileName : BUserDaoTest
 * author : haedoang
 * date : 2022-01-19
 * description :
 */
class BUserDaoTest {

    @Test
    @DisplayName("상속을 통한 사용자 등록 테스트")
    public void insert() throws ClassNotFoundException, SQLException {
        // given
        BUserDao bUserDao = new BUserDao();
        User user = User.of(2L, "박철수", "2345");

        // when
        int actual = bUserDao.add(user);

        // then
        assertThat(actual).isEqualTo(1);
    }

}
