interface BinTree {
    int root();
    BinTree left();
    BinTree right();
    void pp(int level);
    BinTree insert(int key);
}
