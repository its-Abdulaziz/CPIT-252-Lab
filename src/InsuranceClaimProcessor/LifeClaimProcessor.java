package InsuranceClaimProcessor;

public class LifeClaimProcessor extends InsuranceClaimProcessor{
    @Override
    void validateClaim() {
        System.out.println("Validating Life claim.");
    }

    @Override
    void calculatePayment() {
        System.out.println("Calculating payment for life claim.");
    }

    @Override
    void approveClaim() {
        System.out.println("Approving life claim.");
    }
}
