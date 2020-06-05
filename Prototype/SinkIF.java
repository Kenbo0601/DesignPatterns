abstract class SinkIF implements Cloneable {
    //Instead of implementing this method in every subclass, this way is easier because every subclass is a super class
    public SinkIF clone() {
        try {
            return (SinkIF) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException("Something terrible happened");
        }
    }
}
