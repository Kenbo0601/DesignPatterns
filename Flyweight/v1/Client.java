
class Client {
    public static void main(String [] ignore) {
        Glyph a10 = Flyweight.getGlyph('a', 10);
        Glyph a20 = Flyweight.getGlyph('a', 20);
        Glyph b10 = Flyweight.getGlyph('b', 10);
        //Glyph a10d = Flyweight.getGlyph('a', 10);
        Glyph a10d = new Glyph('a', 10);
    }
}
