
class Client {
    public static void main(String [] ignore) {
        ServiceIF service = new Proxy(new Service(), new Customer(16));
        System.out.println(service.getBurger());
        System.out.println(service.getBeer());
    }
}