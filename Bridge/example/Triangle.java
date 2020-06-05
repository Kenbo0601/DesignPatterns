class Triangle extends Shape {
    Triangle(Color c) { super(c); }
    void apply() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }
}
