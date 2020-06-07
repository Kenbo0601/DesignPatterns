//Visitable abstract class
abstract class Color {
    String name;
    Color(String name) { this.name = name; }
    public String toString() { return name; }
    abstract void addColor(Color c);
    abstract void accept(Visitor visitor);
}
