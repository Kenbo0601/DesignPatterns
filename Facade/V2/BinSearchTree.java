class BinSearchTree {
    BinTree theTree = new Leaf();
    void pp(int level) { theTree.pp(0); }
    BinTree insert(int key) { return theTree = theTree.insert(key); }
}
