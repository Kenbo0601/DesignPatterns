class MySingleton {
    //private static variable that points to the only instance of this class
    private static MySingleton theInstance = new MySingleton();

    //private constructor to restrict instantiation to this class only
    private MySingleton(){}

    //needs to be static so this can get called from outside of this class
    static MySingleton getInstance(){ 
        return theInstance;
    }
    
    public void doSomething() {
        System.out.println("Did something");
    }
}
