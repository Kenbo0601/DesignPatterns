
class Adapter implements ServiceIF {
    Service service = new Service();
    final static int DEFAULT = 99;
    public int method_A(int x) {
        return service.method_B(x, DEFAULT);
    }
}