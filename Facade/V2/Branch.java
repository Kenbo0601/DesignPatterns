class Branch implements BinTree {
    int root;
    BinTree left, right;
    Branch(int root, BinTree left, BinTree right) {
        this.root = root; this.left = left; this.right = right;
    }
    public int root() { return root; }
    public BinTree left() { return left; }
    public BinTree right() { return right; }
    public void pp(int level) {
        right.pp(level+1);
        for(int i=0; i<level; i++) System.out.print("- ");
        System.out.println(root);
        left.pp(level+1);
    }
    public BinTree insert(int key) {
        if (key < root)
            left = left.insert(key);
        if (key > root)
            right = right.insert(key);
        return this;
    }
}
