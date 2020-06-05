abstract class  FactoryMethod {
    abstract AccountIF createAccount(int loginId);
    abstract SecurityManagerIF createManager();
    //Factory Method
    User createUser(int loginId) {
        return new User(createAccount(loginId), createManager());
    }
}
