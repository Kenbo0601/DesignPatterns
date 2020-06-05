class Point implements Immutable {
    //final int x; //blank final
    private int x;
    private int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //needs to be public if you have an interface class
    public int getX(){return x;}
    void setX(int x) {this.x = x;}

    public int getY() {return y;}
    void setY(int y) {this.y = y;}
}