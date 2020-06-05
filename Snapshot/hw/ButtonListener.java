import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *  This class handles button clicks to save/restore snapshots.
 */

class ButtonListener implements ActionListener {
    final Board board;
    final Caretaker caretaker;
    final Boolean save;            // either save or restore

    ButtonListener(Board board, Caretaker caretaker, Boolean save) {
        this.board = board;
        this.caretaker = caretaker;
        this.save = save;
    }
    /**
     *  The action performed by the ActionListener.
     *  Either save or restore the board.
     *  @param event Ignored
     */
    public void actionPerformed (ActionEvent event) {
        if (save) {
            caretaker.set(board.getMemento ());
        } else {
            board.setMemento(caretaker.get());
        }
    }
}
