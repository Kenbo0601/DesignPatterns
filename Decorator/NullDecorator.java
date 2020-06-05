class NullDecorator extends DecoratorIF {
    NullDecorator(){ super(null); }
    int cost() { return 0; }
}
