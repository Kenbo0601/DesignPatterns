import java.util.*;

class ListIterator<T> implements Iterator<T> {
    Node<T> current;

    public ListIterator(List<T> list) {
        current = list.getHead();
    }

    public boolean hasNext() {
        return current != null;
    }

    public T next() {
        T data = current.getData();
        current = current.getNext();
        return data;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
