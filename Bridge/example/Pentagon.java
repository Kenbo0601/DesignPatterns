class Pentagon extends Shape {
    Pentagon(Color c) { super(c); }
    void apply() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }
}
