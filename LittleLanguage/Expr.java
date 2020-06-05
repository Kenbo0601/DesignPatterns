abstract class Expr {
    abstract int eval();
}

class Add extends Expr {
    Expr left, right;
    Add(Expr left, Expr right) { this.left = left; this.right = right; }
    int eval() { return left.eval() + right.eval(); }
    public String toString() { return "(" + left + "+" + right + ")"; }
}

class Sub extends Expr {
    Expr left, right;
    Sub(Expr left, Expr right) { this.left = left; this.right = right; }
    int eval() { return left.eval() - right.eval(); }
    public String toString() { return "(" + left + "+" + right + ")"; }
}

class Int extends Expr {
    int value;
    Int(int value) { this.value = value; }
    int eval() { return value; }
    public String toString() { return "" + value; }
}
