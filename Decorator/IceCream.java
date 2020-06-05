class IceCream {
    DecoratorIF next;
    IceCream(DecoratorIF next) { this.next = next; }
    int cost() { return 300 + next.cost(); }
}
