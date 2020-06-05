class Individual extends Unit {
    Individual(String name) { super(name); }
    <T,U> T accept(Visitor<T,U> visitor, U data) {
        return visitor.visit(this,data);
    }

}
