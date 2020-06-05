import java.rmi.*;

class Proxy implements CalculatorIF {
    private static final String name = "calculator";
    private CalculatorIF serverCalc;

    Proxy() {
        System.setSecurityManager(new RMISecurityManager());
        try {
            serverCalc = (CalculatorIF) Naming.lookup(name);
        }
        catch(Exception e){
            System.out.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public float add(float x, float y) {
        try {
            return serverCalc.add(x,y);
        }
        catch(Exception e) {
            System.out.println("Client exception: " + e.getMessage());
            e.printStackTrace();
            return Float.NaN;
        }
    }
}
