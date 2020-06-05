abstract class ToiletIF implements Cloneable {
    public ToiletIF clone() {
        try {
            return (ToiletIF) super.clone();
        } catch(CloneNotSupportedException ex) {
            throw new RuntimeException("Something terrible happened");
        }
    }
}
