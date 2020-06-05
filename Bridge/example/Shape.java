//Abstraction 
//this class holds a reference to implementation
abstract class Shape {
    protected Color color;

    Shape(Color c) { this.color = c; }
    abstract void apply();
}
