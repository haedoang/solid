package lsp;

/**
 * packageName : lsp
 * fileName : Chicken
 * author : haedoang
 * date : 2022/01/10
 * description : 잘못된 상속 도메인
 */
public class Chicken extends Bird {
    @Override
    public void fly() {
        throw new IllegalStateException();
    }
}
