class Client {
    public static void main(String [] ignore) {
        ServiceIF service = new VirtualProxy();
        try {
            System.in.read();
        } catch (Exception ex){} 
        service.execute();
    }
}
