import java.awt.*;
import java.awt.event.*;

/**
 * This class handles mouse clicks on a position whose coordinates are
 * set at construction.  Any action is delegated to the positions's
 * mediator.
 * 
 */

class PositionListener extends MouseAdapter {
    private int row;
    private int col;
    private Mediator mediator;
    /** 
     * Construct the listener.
     * @param row The row of the position target of the event
     * @param col The colums of the position target of the event
     * @param mediator The mediator of the positions
     */
    PositionListener(int row, int col, Mediator mediator) {
        this.row = row;
        this.col = col;
        this.mediator = mediator;	
    }
    /**
     *  Handle a mouse click on the position whose coordinates where set
     *  at construction.  Delegate any action to the mediator.
     */   
    public void mouseClicked(MouseEvent e) { mediator.mediate(row, col); }
}
