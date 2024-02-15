package bridgepatterndemo1;

import java.awt.*;

public class Circle implements Shape1 {

    public void area() {
        System.out.println("the area of circle is: " + 3.14*2*2+"\n");
    }

    @Override
    public void volume() {
        System.out.println("Volume of circle can not calculated");
    }


}
