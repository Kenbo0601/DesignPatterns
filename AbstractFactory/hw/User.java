/**
 * This class represents a user of the internet service provider.
 */
public class User {
    /** The account of this user. */
    private AccountIF account;
    /** The security manager of this user. */
    private SecurityManagerIF securityManager;
   
    public User (AccountIF account, SecurityManagerIF securityManager) {
	this.account = account;
	this.securityManager = securityManager;
    }
    
    public void replaceAccount (AccountIF account) {
	this.account = account;
    }
   
    public String toString () {
	    return "User (" + account + ", " + securityManager + ")";
    }

    public void display() {
        System.out.println(securityManager.getConnectionHours());
        System.out.println(securityManager.getConnectionSpeed());
    }
}