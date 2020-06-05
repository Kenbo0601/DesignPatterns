class Main {
    public static void main(String [] loginIDarray) {
        if (loginIDarray.length != 1) {
            System.err.println ("Command requires an argument");
            System.exit (1);
        }
        int loginId = -1;
        try { loginId = Integer.parseInt (loginIDarray [0]); }
        catch (NumberFormatException ex) {
            System.err.println ("Argument must be an integer");
            System.exit (1);
        }
    
        AccountIF account = null;
        SecurityManagerIF securityManager = null;
        if (1000 < loginId && loginId <= 5000) {
            account = new AccountEconomy(0);
            securityManager = new SecurityManagerEconomy();
    //      Standard and professional products haven't been coded, yet
    //	} else if (5000 < loginId && loginId <= 8000) {
    //	    account = new AccountStandard(0);
    //          securityManager = new SecurityManagerStandard();
    //	} else if (8000 < loginId && loginId <= 9999)
    //	    account = new AccountProfessional(0);
    //          securityManager = new SecurityManagerProfessional();
        } else {
            System.err.println ("Argument out of range");
            System.exit (1);
        }
    
        PrototypeFactory  factory
            = new PrototypeFactory (account, securityManager);
        // Note how the following code is independent of the
            // account type: economy, standard or professional. 
        // Both the account and the security manager are
        // created consistently (for each other) by the factory.
        User user
            = new User (factory.createAccount (loginId),
                factory.createSecurityManager ());
        System.out.println (user);
    }
}
