class Main {
    public static void main(String [] ignore) {
        //AbstractFactory af = new RomanFactory();
    
        //abstract class cannot be instantiated, but can reference 
        AbstractFactory af = new ParisFactory();
        Client client = new Client();
        client.make_bathroom(af);
    }
}