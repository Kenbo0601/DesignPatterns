/**
 *  This class mediates (handles) mouse clicks on a position.
 *  E.g., if a position is already occupied and muose click on it is ignored.
 *
 */

public class Mediator {
    private Position [] [] cell;
    /**
     *  Construct a position.
     *  @param cell The array of positions of the board.
     */
    public Mediator (Position [] [] cell) { this.cell = cell; }

    // directions                            E SE  S SW  W NW  N NE
    private static final int [] dx_array = { 1, 1, 0,-1,-1,-1, 0, 1};
    private static final int [] dy_array = { 0, 1, 1, 1, 0,-1,-1,-1};

    private Position [] toFlip = new Position [Board.size * Board.size];

    /**
     *  Called when position at the given row and col is clicked.
     *  If the clicked position is empty and can be occupied,
     *  the position is occupied and all other positions involved
     *  in the move are flipped.
     *  @param row the row of the clicked position
     *  @param col the column of the clicked position
     */
    public void mediate (int row, int col) {
	    if (cell [row] [col].getState () != Position.empty) return;
	    int player = 0;
	    for (int r = 0; r < Board.size; r++)
	        for (int c = 0; c < Board.size; c ++)
		    if (cell [r] [c].getState () != Position.empty)
		        player++;
	    player = player % 2 == 0 ? Position.first : Position.second;
	    int opponent = player == Position.first ? Position.second : Position.first;
	    int flipCounter = 0;
	    // for each direction, record position to be flipped
	    for (int i = 0; i < dx_array.length; i++) {
	        int dx = dx_array [i];
	        int dy = dy_array [i];
	        try {
		    if (cell [row+dx] [col+dy].getState() == opponent) {
		        for (int k = 2; ;k++) {
			        int state = cell [row+k*dx] [col+k*dy].getState();
			        if (state == player) {
			            for (k--; k >= 1; k--)
				        toFlip [flipCounter++] = cell [row+k*dx] [col+k*dy];
			            break;
			        }
			        else if (state == Position.empty) 
                        break;
			        else 
                        continue;
		        }
		    }
	        } catch (ArrayIndexOutOfBoundsException aioobe) { continue; }
	    }
	    if (flipCounter > 0) {
	        for (int i = 0; i < flipCounter; i++)
		    toFlip [i].setState (player);
	        cell [row] [col].setState (player);
	    }
    }
}
