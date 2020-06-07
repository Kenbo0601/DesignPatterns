import java.util.Vector;

//Concrete visitable
class Composite extends Color {
    Vector<Color> color = new Vector<>();
    Composite(String name) { super(name); }
    void addColor(Color c) { color.add(c); }
    void accept(Visitor visitor) { visitor.visit(this); }
}
