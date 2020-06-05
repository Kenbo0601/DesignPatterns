import java.util.Enumeration;

class Client {
    public static void main(String [] ignore) {
        Library library = new Library();
        for(Enumeration e = library.elements(); e.hasMoreElements();)
            System.out.println(e.nextElement());
    }
}