/**
 *  Caretaker of a snapshot of the Othello's board.
 * The snapshot is help in a variable.
 */

public class Caretaker {
    private Object snapshot = null;
    
    /**
     *  Hold the snapshot passed as argument
     *  @param snapshot The snapshot
     */
    void set(Object snapshot) { this.snapshot = snapshot; }
    
    /**
     *  Return the snapshot helf, if any
     *  @return the snapshot
     */
    Object get()  {
        if (snapshot == null)
            throw new IllegalStateException();
        else
            return snapshot;
    }
}
