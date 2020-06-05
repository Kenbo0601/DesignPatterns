abstract class FactoryMethod {
    abstract SinkIF createSink();
    abstract ToiletIF createToilet();

    //this is the factory method 
    final Bathroom createBathroom() {
        return new Bathroom(createSink(), createToilet());
    }
}
