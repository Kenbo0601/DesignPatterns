
public class Source extends FilterIF {
    Source(){ super(null); }
    TaxReturn doTheJob() {
        System.out.println("serving a tax return.");
        return new TaxReturn();
    }
}