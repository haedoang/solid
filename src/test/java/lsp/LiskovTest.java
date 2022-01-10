package lsp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * packageName : lsp
 * fileName : SparrowTest
 * author : haedoang
 * date : 2022/01/10
 * description :
 */
class LiskovTest {

    @Test
    @DisplayName("새가 납니다.")
    public void fly() {
        BirdUtil.fly(new Bird());
        BirdUtil.fly(new Sparrow());
    }

    @Test
    @DisplayName("잘못된 상속 관계는 리스코프 치환 법칙에 위배된다.")
    public void chickenFly() {
        // then
        assertThatThrownBy(() -> new Chicken().fly()).isInstanceOf(IllegalStateException.class);
    }

    @Test
    @DisplayName("리스코프 치환 법칙을 위배하는 예시")
    public void squareAndRectangle() {
        // given
        final Rectangle rectangle = new Rectangle(5, 5);
        final Square square = new Square(5, 5);

        // then
        assertThat(rectangle.area()).isEqualTo(square.area());

        // when
        rectangle.setWidth(10);
        square.setWidth(10);

        // then
        assertThat(rectangle.area()).isNotEqualTo(square.area());
    }
}