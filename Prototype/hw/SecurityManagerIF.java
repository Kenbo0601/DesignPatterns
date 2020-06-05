/**
 *  Interface of all security managers of an account.
 */
public abstract class SecurityManagerIF implements Cloneable {
    public abstract int getConnectionHours ();
    public abstract int getConnectionSpeed ();
    public SecurityManagerIF clone() {
        try {
            return (SecurityManagerIF) super.clone();
        } 
        catch(CloneNotSupportedException ex) {
            throw new RuntimeException("Clone not supported.");
        }
    }

}

