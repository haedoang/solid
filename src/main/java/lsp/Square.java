package lsp;

/**
 * packageName : lsp
 * fileName : Square
 * author : haedoang
 * date : 2022/01/10
 * description :
 */
public class Square extends Rectangle {
    public Square(int width, int height) {
        super(width, height);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
