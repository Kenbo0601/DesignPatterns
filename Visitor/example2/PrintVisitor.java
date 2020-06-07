//Concrete visitor
class PrintVisitor implements Visitor {

    public void visit(Primary primary) {
        System.out.print(primary.name + " ");
    }

    public void visit(Composite composite) {
        for(Color c : composite.color)
            c.accept(this);
    }
}
