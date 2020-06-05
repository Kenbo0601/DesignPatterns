interface AbstractFactory {
    AccountIF createAccount(int loginId);
    SecurityManagerIF createManager();
}