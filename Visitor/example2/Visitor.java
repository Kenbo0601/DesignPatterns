//Visitor interface
interface Visitor {
    void visit(Primary primary);
    void visit(Composite composite);
}
