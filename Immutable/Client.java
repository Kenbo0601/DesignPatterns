class Client {
    public static void main(String [] ignore){
        //MyImmutable p = new MyImmutable(3,4);
        //p.x = 7;
        //p.setX(7);
        Immutable p = new Point(3,4);
        //p.setX(7); this cant be executed
        //p is an instance of Immutable class, not Point
        //and there is not setX method in Immutable
        System.out.println(p.getX());
        ((Point)p).setX(7); //Instead, we can do cansting
    }
}