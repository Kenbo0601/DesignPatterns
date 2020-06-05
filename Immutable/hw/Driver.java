class Driver {
    public static void main(String [] ignore) {
        Immutable p = new Position(3,4);
        Mutable q = new Position(3,4);
        System.out.println("Tesing Immutable");
        System.out.println("X is " + p.getX());
        System.out.println("Y is " + p.getY());
        
        //testing mutable 
        q.setX(10);
        q.setY(20);
        System.out.println("Tesing Mutable");
        //System.out.println("X is " + q.getX());
        //System.out.println("Y is " + q.getY());
    }
}
