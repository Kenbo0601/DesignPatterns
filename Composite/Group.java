import java.util.Vector;

class Group extends Unit {
    Vector<Unit> members = new Vector<>();
    Group(String name) { super(name); }
    void addMember(Unit unit) { members.add(unit); }
    void pp(int level) {
        super.pp(level);
        System.out.println("Group: " + name);
        for(Unit u : members) 
            u.pp(level+1);
    }
}