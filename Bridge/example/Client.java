class Client {
    public static void main(String [] ignore) {
        Shape tri = new Triangle(new RedColor());
        tri.apply();

        Shape pent = new Pentagon(new GreenColor());
        pent.apply();
    }
}
