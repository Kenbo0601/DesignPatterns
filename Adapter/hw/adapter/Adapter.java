package adapter;
import matrix.*;

public class Adapter {
    //singleton
    private Adapter() {}

    public static Matrix add(Matrix l, Matrix r) {
        return Matrix.plus(l, r);
    }

    public static Matrix sub(Matrix l, Matrix r) {
        return Matrix.minus(l, r);
    }
}