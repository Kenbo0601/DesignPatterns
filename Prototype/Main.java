class Main {
    public static void main(String [] ignore) {
        Prototype ptf = new Prototype();
        // ptf.setProducts(new RomanSink(), new RomanToilet());
        ptf.setProducts(new ParisSink(), new ParisToilet());
        Client client = new Client();
        client.make_bathroom(ptf);
    }
}
