class Position implements Mutable, Immutable {
    private int x;
    private int y;
    
    //Constructor
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Position offset(int xOffset, int yOffset) {
        return new Position(x+xOffset, y+yOffset);
    }
}