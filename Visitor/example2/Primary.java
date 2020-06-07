//Concrete visitable
class Primary extends Color {
    Primary(String name) { super(name); }
    void addColor(Color c){}
    void accept(Visitor visitor) { visitor.visit(this); }
}
