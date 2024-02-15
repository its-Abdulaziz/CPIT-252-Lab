package bridgepatterndemo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BridgePatternDemo1 {

    public static void main(String[] args) throws IOException {
        Shape1 obj1 = new Circle();
        Shape1 obj2 = new Rectangle();
        Shape1 obj3 = new Sphere();
        int choice;
        do {
            System.out.println("==========Shape Area and Volume options==========\n");
            System.out.println("           1. Circle \n");
            System.out.println("           2. Rectangle \n");
            System.out.println("           3. Sphere \n");
            System.out.println("           4. Exit \n");
            System.out.println("Enter your choice: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1: {
                    obj1.area();
                    obj1.volume();
                }
                break;
                case 2: {
                    obj2.area();
                    obj2.volume();
                }
                break;
                case 3: {
                    obj3.area();
                    obj3.volume();
                }
                default: {
                    System.out.println("Nothing You Select");
                }
                return;
            }
        } while (choice != 4);
    }
}
