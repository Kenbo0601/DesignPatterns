import java.util.Hashtable;

class Flyweight {

    static private class Glyph implements GlyphIF {
        final char c;
        final int size;
        Glyph(char c, int size) {
            this.c = c;  this.size = size;
            System.out.println("Constructing " + c + " " + size);
        }
        public void render() { /* whatever */ }
    }

    private Flyweight() {}
    static Hashtable<String, Glyph> store = new Hashtable<>();
    static GlyphIF getGlyph(char c, int size) {
        String key = c + " " + size;
        Glyph glyph = store.get(key);
        if (glyph == null) {
            glyph = new Glyph(c, size);
            store.put(key, glyph);
        }
        return glyph;
    }
}
