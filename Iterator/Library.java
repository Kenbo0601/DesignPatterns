import java.util.Enumeration;
import java.util.NoSuchElementException;

class Library {
    private class MyIterator implements Enumeration {
        int counter = 0;
        public boolean hasMoreElements() { return theBooks.length > counter; }
        public Object nextElement() { 
            if(hasMoreElements())
                return theBooks[counter++]; 
            else
                throw new NoSuchElementException();
        }
    }

    private Book [] theBooks = {
        new Book("Java"),
        new Book("Python"),
        new Book("Curry"),
    };

    Enumeration elements() { return new MyIterator(); }
}