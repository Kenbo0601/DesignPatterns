//Base class of all accounts
public abstract class AccountIF implements Cloneable {
    protected int loginId;
    protected int connectionHoursThisMonth;
    protected int connectionSpeedThisLogin;
    
    public AccountIF clone() {
        try {
            return (AccountIF) super.clone();
        } 
        catch(CloneNotSupportedException ex) {
            throw new RuntimeException("Clone not supported.");
        }
    }

    public int getConnectionHoursThisMonth() {
        return connectionHoursThisMonth;
    }

    public int getConnectionSpeedThisLogin() {
        return connectionSpeedThisLogin;
    }

	public void setLoginId(int loginId) {
        this.loginId = loginId;
	}
}
