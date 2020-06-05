class RegularPizzaFactory extends AbstractPizzaFactory {
    /** Regular implementation of the AbstractCrust interface. */
    private class Crust implements AbstractCrust {
	    public int calories () { return 350; }
    }
    /** Regular implementation of the AbstractCheese interface. */
    private class Cheese implements AbstractCheese {
	    public int calories () { return 600; }
    }
    /**
     *  Method to create a crust.
     *  @return this factory's implementation of a crust.
     */
    AbstractCrust createCrust () { return new Crust (); }
    /**
     *  Method to create a crust.
     *  @return this factory's implementation of a crust.
     */
    AbstractCheese createCheese () { return new Cheese (); }
}
