class Finder implements Visitor<Boolean, String> {
    public Boolean visit(Individual individual, String name) {
        return individual.name.equals(name);
    }
    public Boolean visit(Group group, String name) {
        if(group.name.equals(name))
            return true;
        else {
            for(Unit u : group.members)
                if(u.accept(this, name))
                    return true;
        }
        return false;
    }
}
