
public class LateFee extends FilterIF {
    LateFee(FilterIF previous) { super(previous); }
    TaxReturn doTheJob() {
        TaxReturn current = previous.doTheJob();
        System.out.println("assessing late fee");
        return current;
    }
}