package compositepatterndemo1;

public class PlanDirectory implements Plan{

    public void add(Plan p) {
        p.show();
    }

    @Override
    public void show() {
        System.out.println("PlanDirectory is COMPOSITE Class \nDomestic Plan and Commercial plan are examples of Leaf " +
                "Classes\n");
    }
}
