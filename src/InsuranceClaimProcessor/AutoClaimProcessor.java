package InsuranceClaimProcessor;

public class AutoClaimProcessor extends InsuranceClaimProcessor{
    @Override
    void validateClaim() {
        System.out.println("Validating auto claim.");
    }

    @Override
    void calculatePayment() {
        System.out.println("Calculating payment for auto claim.");
    }

    @Override
    void approveClaim() {
        System.out.println("Approving auto claim.");
    }
}
