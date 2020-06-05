class Main {
    public static void main(String [] ignore) {
        int loginId = 1002;
        AbstractFactory factory = new EcomonyFactory();
        User user = new User(factory.createAccount(loginId), factory.createManager());
        //user.display();
        System.out.println(user);
    }
}
