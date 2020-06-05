
public class VerifyPin extends FilterIF {
    VerifyPin(FilterIF previous) { super(previous); }
    TaxReturn doTheJob() {
        TaxReturn current = previous.doTheJob();
        System.out.println("verifying the pin.");
        return current;
    }
}