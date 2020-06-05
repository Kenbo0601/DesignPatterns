
abstract class FilterIF {
    FilterIF previous;
    FilterIF(FilterIF previous) {
        this.previous = previous;
    }
    abstract TaxReturn doTheJob();
}