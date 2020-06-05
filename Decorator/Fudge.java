class Fudge extends DecoratorIF { 
    Fudge(DecoratorIF next) { super(next); }
    int cost(){
        return 30 + next.cost();
    }
}
