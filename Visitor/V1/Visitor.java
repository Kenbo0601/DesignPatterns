interface Visitor<T,U> {
    T visit(Individual individual, U data);
    T visit(Group group, U data);
}
