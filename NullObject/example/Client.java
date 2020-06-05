class Client {
    public static void main(String [] ignore) {
        String [] shapeTypes = new String [] {
            "Circle",
            null,
            "Triangle",
            "Pentagon",
            "Rectangle",
        };

        for(String s : shapeTypes) {
            Shape shape = ShapeFactory.createShape(s);
            System.out.println("Shape area: " + shape.area());
            System.out.println("Shape Perimeter: " + shape.perimeter());
            shape.draw();
            System.out.println();
        }
    }
}
