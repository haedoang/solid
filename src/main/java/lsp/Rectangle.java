package lsp;

/**
 * packageName : lsp
 * fileName : Rectangle
 * author : haedoang
 * date : 2022/01/10
 * description :
 */
public class Rectangle {
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return width * height;
    }
}
