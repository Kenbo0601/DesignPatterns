class Individual extends Unit {
    Individual(String name) { super(name); }
    void pp(int level) {
        super.pp(level);
        System.out.println("Individual: " + name);
    }
}