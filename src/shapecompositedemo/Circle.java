package shapecompositedemo;

import bridgepatterndemo1.Shape1;

public class Circle implements Shape2 {


    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
