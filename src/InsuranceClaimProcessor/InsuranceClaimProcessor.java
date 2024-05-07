package InsuranceClaimProcessor;

public abstract class InsuranceClaimProcessor {

    public final void processClaim() {
        logClaim();
        validateClaim();
        calculatePayment();
        approveClaim();
        sendNotification();
    }

    private void sendNotification() {
        System.out.println("Notification sent to the claimant");
    }

    abstract void  validateClaim();
    abstract void  calculatePayment();
    abstract void  approveClaim();


    private void logClaim() {
        System.out.println("Claim logged at: " + java.time.LocalDateTime.now());
    }

}
