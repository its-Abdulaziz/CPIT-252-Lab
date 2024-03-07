package facadepatternclient;

import java.util.Scanner;

public class FacadePatternClient {

    public static int choice;

    public static void main(String[] args) {
        do {
            System.out.print("======== Plan Type ======== \n");
            System.out.print("        1. Domestic Plan        \n");
            System.out.print("        2. Commercial Plan        \n");
            System.out.print("        3. Institution Plan        \n");
            System.out.print("        4. Exit         \n");
            System.out.println("Enter your choice: ");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            PlanKeeper planObj = new PlanKeeper();

            switch (choice) {
                case 1:
                    planObj.domesRate();
                     break;
                case 2:
                    planObj.commerRate();
                    break;
                case 3:
                    planObj.institutePlanRate();
                    break;
                default:
                {
                    System.out.println("You Selected Nothing");
                }
                return;
            }
        } while (choice != 4);
    }
}
