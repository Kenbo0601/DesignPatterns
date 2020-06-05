import java.util.*;
import java.util.stream.*;

class Subject {
    int [] data = { 1,2,3, };
    boolean weather = false;
    //lots of methods
    private static class Memento { 
        int [] data; 
    }

    Object save() {
        Memento memento = new Memento();
        memento.data = new int [data.length];
        System.arraycopy(data, 0, memento.data, 0, data.length);
        return memento;
    }

    void restore(Object object) {
        int [] data = ((Memento)object).data;
        System.arraycopy(data, 0, this.data, 0, data.length);
    }

    public String toString() {
        String str = Arrays.stream(data).mapToObj(x -> Integer.toString(x)).collect(Collectors.joining(", "));
        return str;
    }
}
