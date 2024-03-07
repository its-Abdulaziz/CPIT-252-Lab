package facadepatterndemo;

public class ShapeMaker {

    private Shape3 circle;
    private Shape3 rectangle;
    private Shape3 square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }
    public void drawRectangle() {
        rectangle.draw();
    }
    public void drawSquare() {
        square.draw();
    }

}
