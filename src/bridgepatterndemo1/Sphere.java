package bridgepatterndemo1;

public class Sphere implements Shape1{


    @Override
    public void area() {
        System.out.println("The area of Sphere is: " + 4*3.14*2*2+"\n");
    }

    @Override
    public void volume() {
        System.out.println("The volume of Sphere is: " + 1.33*3.14*2*2*2+"\n");

    }
}
