import java.util.Vector;

class Group extends Unit {
    Vector<Unit> members = new Vector<>();
    Group(String name) { super(name); }
    void addMember(Unit unit) { members.add(unit); }
    //method to remove
    <T,U> T accept(Visitor<T,U> visitor, U data) {
        return visitor.visit(this,data);
    }

}
