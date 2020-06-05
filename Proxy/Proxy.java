class Proxy implements ServiceIF {
    Service service;
    Customer customer;
    Proxy(Service service, Customer customer) {
        this.service = service;
        this.customer = customer;
    }

    public String getBurger() {
        return service.getBurger();
    }
    public String getBeer() {
        if(customer.age < Customer.limit)
            return "Sorry, you are under age";
        else
            return service.getBeer();
    }
}