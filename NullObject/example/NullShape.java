//Null Object
class NullShape implements Shape {
    public double area(){ return 0.0d; }
    public double perimeter() { return 0.0d; }
    public void draw(){ System.out.println("Null Object can't be draw"); }
    public boolean isNull() { return true; }
}
