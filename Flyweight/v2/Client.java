class Client {
    public static void main(String [] ignore) {
        GlyphIF a10 = Flyweight.getGlyph('a', 10);
        GlyphIF a20 = Flyweight.getGlyph('a', 20);
        GlyphIF b10 = Flyweight.getGlyph('b', 10);
        GlyphIF a10d = Flyweight.getGlyph('a', 10);
        // GlyphIF a10d = new Glyph('a', 10);        
    }
}
