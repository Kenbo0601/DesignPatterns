class Branch {
    int root;
    Branch left, right;
    Branch(int root, Branch left, Branch right) {
        this.root = root; this.left = left; this.right = right;
    }

    public int root() { return root; }
    public Branch left() { return left; }
    public Branch right() { return right; }
    public void pp(int level) {
        if (right != null) right.pp(level+1);
        for(int i=0; i<level; i++) System.out.print("- ");
        System.out.println(root);
        if (left != null) left.pp(level+1);
    }

    public Branch insert(int key) {
        if (key < root)
            if (left != null) left.insert(key);
            else left = new Branch(key, null, null);
        if (key > root)
            if (right != null) right.insert(key);
            else right = new Branch(key, null, null);
        return this;
    }
}