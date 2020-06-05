class Client {
    public static void main(String [] ignore) {
        Good good = new Good();
        Bad bad = new Bad();
        if(good instanceof MarkerIF) {
            System.out.println(good);
        }
        if(bad instanceof MarkerIF) {
            System.out.println(bad);
        }
    }
}