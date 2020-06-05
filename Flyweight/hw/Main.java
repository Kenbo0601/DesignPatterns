
public class Main {
    public static void main (String [] arg) {
      
      VarFactory vf = VarFactory.getInstance ();

	    Statement factorial = new Compound (
        new Assignment (vf.makeVar ("fact"), vf.makeVar ("1")), new While (new Gt (vf.makeVar ("n"),
                        vf.makeVar ("1")), new Compound ( new Assignment (vf.makeVar ("fact"), new Mul (vf.makeVar ("fact"),
                        vf.makeVar ("n"))),new Assignment (vf.makeVar ("n"), new Sub (vf.makeVar ("n"), vf.makeVar ("1"))))));


      //No Flyweight
       Statement factorial2 = new Compound (
        new Assignment (new Variable ("fact"), new Variable ("1")), new While (new Gt (new Variable ("n"),
                        new Variable ("1")), new Compound (new Assignment (new Variable ("fact"), new Mul (new Variable ("fact"), 
                        new Variable ("n"))), new Assignment (new Variable ("n"), new Sub (new Variable ("n"), new Variable ("1"))))));

      System.out.println("-- factorial (Flyweight) ---");
      factorial.print (System.out, 0);
      System.out.println('\n');
      System.out.println("--- factorial2 (no Flyweight) ---");
      factorial2.print(System.out, 0);
	    System.out.println ();
    }
}
