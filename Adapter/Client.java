class Client {
    public static void main(String [] ignore) {
        ServiceIF service = new Adapter();
        System.out.println(service.method_A(23));
    }
}