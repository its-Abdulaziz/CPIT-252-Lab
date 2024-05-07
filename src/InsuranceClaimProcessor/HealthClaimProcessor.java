package InsuranceClaimProcessor;

public class HealthClaimProcessor extends InsuranceClaimProcessor{

    @Override
    void validateClaim() {
        System.out.println("Validation health claim.");
    }

    @Override
    void calculatePayment() {
        System.out.println("Calculating payment for health claim.");
    }

    @Override
    void approveClaim() {
        System.out.println("Approving health claim.");
    }
}
