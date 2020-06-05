class Client {
    public static void main(String [] ignore){
        MySingleton a = MySingleton.getInstance();
        MySingleton b = MySingleton.getInstance();
        //MySingleton c = new MySingleton(); #we can't do this because the constructor is private
        b.doSomething();
        assert(a==b);
        if(a == b){
            System.out.println("Same object");
        }
    }
}
