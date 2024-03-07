package facadepatternclient;

public class DomestPlan implements PlanType{

    @Override
    public void getPlan() {
        System.out.println("Domestic Plan");
    }

    @Override
    public void gerRate() {
        System.out.println("6000 SAR");
    }
}
