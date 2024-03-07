package facadepatternclient;

public class PlanKeeper {
    private PlanType domesticPlan;
    private PlanType commercialPlan;
    private PlanType institutionPlan;

    public PlanKeeper() {
        domesticPlan = new DomestPlan();
        commercialPlan = new CommercialPlan();
        institutionPlan = new InstitutionPlan();
    }
    public void domesRate()  {
        domesticPlan.getPlan();
        domesticPlan.gerRate();
    }
    public void commerRate()  {
        commercialPlan.getPlan();
        commercialPlan.gerRate();
    }

    public void institutePlanRate()  {
        institutionPlan.getPlan();
        institutionPlan.gerRate();
    }

}
