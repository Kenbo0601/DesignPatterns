abstract class DecoratorIF {
    DecoratorIF next;
    DecoratorIF(DecoratorIF next){ this.next = next; }
    abstract int cost();
    //sometims methods to add/remove decorators dynamically
}
