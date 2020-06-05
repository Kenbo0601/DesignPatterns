class Client {
    public static void main(String [] igonre) {
        Proxy proxy = new Proxy();
        float result = proxy.add(2.2f,6.6f);
        System.out.println("Client: Calculator result: " + result);
    }
}
