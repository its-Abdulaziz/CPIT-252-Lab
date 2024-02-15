package shapecompositedemo;

public class Drawing implements Shape2 {

    public void add(Shape2 s) {
        s.draw();
    }

    @Override
    public void draw() {
        System.out.println("This is composite class");
    }
}
