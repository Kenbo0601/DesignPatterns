class VirtualProxy implements ServiceIF {
    ServiceIF service = null;
    public void execute(){
        if(service == null)
            service = new Service();
        service.execute();
    }
}
