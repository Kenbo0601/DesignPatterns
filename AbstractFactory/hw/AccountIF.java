//Base class of all accounts
public abstract class AccountIF {
    protected int loginId;
    protected int connectionHoursThisMonth;
    protected int connectionSpeedThisLogin;

    public int getConnectionHoursThisMonth() {
        return connectionHoursThisMonth;
    }

    public int getConnectionSpeedThisLogin() {
        return connectionSpeedThisLogin;
    }
}