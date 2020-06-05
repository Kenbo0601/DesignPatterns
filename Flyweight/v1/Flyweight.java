import java.util.Hashtable;

class Flyweight {
    private Flyweight() {}
    static Hashtable<String, Glyph> store = new Hashtable<>();
    static Glyph getGlyph(char c, int size) {
        String key = c + ", " + size;
        Glyph glyph = store.get(key);
        if(glyph == null) {
            glyph = new Glyph(c,size);
            store.put(key,glyph);
        }
        return glyph;
    }
}
