public class AccountEconomy extends AccountIF {
    public AccountEconomy(int loginId) {
        this.loginId = loginId;
    }

    public String toString() {
        return "AccountEconomy ( " + loginId + " )";
    }
}