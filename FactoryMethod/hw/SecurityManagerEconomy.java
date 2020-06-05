
public class SecurityManagerEconomy extends SecurityManagerIF {
    /** Maximum connection hours per months. */
    private static final int connectionHoursLimit = 60;
    /** Maximum connection speed. */
    private static final int connectionSpeedLimit = 56;
   
    public int getConnectionHours () { 
        return connectionHoursLimit; 
    }
    
    public int getConnectionSpeed () { 
        return connectionSpeedLimit; 
    }
   
    public String toString () { 
        return "SecurityManagerEconomy"; 
    }
}
