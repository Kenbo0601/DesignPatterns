
class Client {
    public static void main(String [] ignore) {
        MyObject o1 = Pool.getObject();
        MyObject o2 = Pool.getObject();
        Pool.returnObject(o1);

        if(o1 == o2) {
            System.out.println("same object");
        } else {
            System.out.println("not the same");
        }

        //I'm messing around
        //Pool.returnObject(o1);
        //o1 = Pool.getObject();
        MyObject o3 = new MyObject();
    }
}
