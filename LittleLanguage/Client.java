import java.util.ArrayList;

class Client {
    public static void main(String [] args) {

        String text = args[0];
        System.out.println(text);

        ArrayList<TokenIF> scan = new Scanner().scan(text);
        for(TokenIF t : scan) 
            System.out.println(t.tkn);

        //parse here
        Expr expr = new Parser().parse(scan);
        System.out.println(expr + " = " + expr.eval());
    }
}
