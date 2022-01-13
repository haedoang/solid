package srp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import srp.domain.Email;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * packageName : srp
 * fileName : SrpTest
 * author : haedoang
 * date : 2022-01-13
 * description :
 */
public class SrpTest {

    @Test
    @DisplayName("User 객체 생성")
    public void createUser() {
        // given
        User user = new User(1L, "haedoang", "haedoang@xmail.com");

        // then
        assertThat(user).isNotNull();
    }

    @Test
    @DisplayName("이메일 주소 형식이 아닐 경우 예외를 반환한다.")
    public void emailCheck() {
        assertThatThrownBy(() -> new User(1L, "haedoang", "haedoang.github.com")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("도메인의 관심사를 분리한다.")
    public void separateDomain() {
        // given
        Email email = new Email("haedoang@xmail.com");
        srp.domain.User user = new srp.domain.User(1L, "haedoang", email);

        // then
        assertThat(user).isNotNull().as("email 객체의 유효성은 email 객체를 생성할 때 검증한다.");
    }


}
