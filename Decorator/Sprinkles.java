class Sprinkles extends DecoratorIF {
    Sprinkles(DecoratorIF next) { super(next); }
    int cost() { return 25 + next.cost(); }
}
        
