import java.util.stream.IntStream;

class Printer implements Visitor<Object,Integer> {
    void indent(int level) {
        IntStream.range(0,level).forEach(x->System.out.print("- "));
    }
    
    public Object visit(Individual individual, Integer level) {
        indent(level);
        System.out.println("Individual: " + individual.name);
        return null;
    }

    public Object visit(Group group, Integer level) {
        indent(level);
        System.out.println("Group: " + group.name);
        for(Unit u : group.members)
            u.accept(this, level+1);
        return null;
    }
}
