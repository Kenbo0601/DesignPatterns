class Leaf implements BinTree {
    public int root() { throw new UnsupportedOperationException(); }
    public BinTree left() { throw new UnsupportedOperationException(); }
    public BinTree right() { throw new UnsupportedOperationException(); }
    public void pp(int level) {}
    public BinTree insert(int key) {
        return new Branch(key, new Leaf(), new Leaf());
    }
}
