import java.util.*;

class Library implements Iterable<Book> {
    private class MyIterator implements Iterator<Book> {
        int counter = 0;
        public boolean hasNext() { return theBooks.length > counter; }
        public Book next() {
            if (hasNext())
                return theBooks[counter++];
            else throw new NoSuchElementException();
        }
    }
    private Book [] theBooks = {
        new Book("Java"),
        new Book("Python"),
        new Book("Curry"),
    };
    public Iterator<Book> iterator() { return new MyIterator(); }
}
