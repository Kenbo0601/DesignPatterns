class Client {
    public static void main(String [] ignore) {
        IceCream icecream = new IceCream(new Fudge(new Sprinkles(new NullDecorator())));
        System.out.println("Cost " + icecream.cost());
    }
}
