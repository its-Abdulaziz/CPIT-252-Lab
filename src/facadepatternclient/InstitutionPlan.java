package facadepatternclient;

public class InstitutionPlan implements PlanType{
    @Override
    public void getPlan() {
        System.out.println("Institution Plan");
    }

    @Override
    public void gerRate() {
        System.out.println("8000 SAR");
    }
}
