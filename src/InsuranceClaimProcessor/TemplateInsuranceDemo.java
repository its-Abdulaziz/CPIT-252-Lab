package InsuranceClaimProcessor;

public class TemplateInsuranceDemo {
    public static void main(String[] args) {
        InsuranceClaimProcessor healthClaim = new HealthClaimProcessor();
        InsuranceClaimProcessor autoClaim = new AutoClaimProcessor();
        InsuranceClaimProcessor lifeClaim = new LifeClaimProcessor();

         healthClaim.processClaim();
         autoClaim.processClaim();
         lifeClaim.processClaim();


    }
}
