package bridgepatterndemo1;

import java.awt.*;
import java.awt.Shape;

public class Rectangle implements Shape1 {

    @Override
    public void area() {
        System.out.println("Rectangle Area");
    }

    @Override
    public void volume() {
        System.out.println("Rectangle Volume");
    }
}
