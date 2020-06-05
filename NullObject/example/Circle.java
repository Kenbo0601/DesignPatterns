class Circle implements Shape {
    private final double radius;

    public Circle(){ this(1.0d); }
    public Circle(double radius) { this.radius = radius; }
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void draw() {
        System.out.println("Drawing Circle with area: " + area() + " and perometer: " + perimeter());
    }

    public boolean isNull() { return false; }
}
