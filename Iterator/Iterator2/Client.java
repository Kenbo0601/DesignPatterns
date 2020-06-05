import java.util.Iterator;

class Client {
    public static void main(String [] ignore) {
        Library library = new Library();
        // for(Book x : library) System.out.println(x);
        for (Iterator<Book> it = library.iterator(); it.hasNext(); )
            System.out.println(it.next());
    }
}
