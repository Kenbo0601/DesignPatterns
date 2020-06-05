class Main {
    public static void main(String [] ignore) {
        FactoryMethod fm = new ParisFactory();
        Bathroom bathroom = fm.createBathroom();
        System.out.println(bathroom); //Same as bathroom.toString()
    }
}