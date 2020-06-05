class RomanFactory extends FactoryMethod {
    public SinkIF createSink() {
        return new RomanSink();
    }

    public ToiletIF createToilet() {
        return new RomanToilet();
    }

    //error with final qualifier in base class
    //Bathroom createBathroom(){return null;}

}