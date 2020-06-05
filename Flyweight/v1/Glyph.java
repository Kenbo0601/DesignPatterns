
//constructor is not private in this program
class Glyph {
    final char c;
    final int size;
    Glyph(char c, int size){
        this.c = c;
        this.size = size;
        System.out.println("Constructing " + c + ", " + size);
    }
    void render() { /*whatever*/ }
}
