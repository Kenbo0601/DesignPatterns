import java.io.*;

class Main {
    public static void main(String [] ignore) {
        Statement factorial = new Compound (
            new Assignment ("fact", new Expr ()), new While (new Expr (), new Compound (new Assignment ("fact", new Expr ()),
            new Assignment ("n", new Expr ()))));
        factorial.print (System.out, 0);
        System.out.println ();
    }
}
