class Client {
    public static void main(String [] ignore) {
        
        PrintVisitor printer = new PrintVisitor();
        
        Color red = new Primary("red");
        Color blue = new Primary("blue");
        Color green = new Primary("green");
        Color noColor = new Primary(" ");
        Color yellow = new Composite("yellow");
        Color orange = new Composite("orange");
        Color white = new Composite("white");
        Color black = new Composite("black");
        Color pink = new Composite("pink");
        Color lilac = new Composite("lilac");

        yellow.addColor(red);
        yellow.addColor(green);
        orange.addColor(red);
        orange.addColor(yellow);
        white.addColor(red);
        white.addColor(green);
        white.addColor(blue);
        black.addColor(noColor);
        pink.addColor(white);
        pink.addColor(red);
        lilac.addColor(pink);
        lilac.addColor(white);
        lilac.addColor(blue);

        Color [] color = { red, yellow, orange, white, black, pink, lilac };

        for(Color c : color) {
            System.out.print(c.name + " -> ");
            c.accept(printer);
            System.out.println();
        }
    }
}
