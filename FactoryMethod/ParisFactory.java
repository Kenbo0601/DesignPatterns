class ParisFactory extends FactoryMethod {
    public SinkIF createSink() {
        return new ParisSink();
    }

    public ToiletIF createToilet() {
        return new ParisToilet();
    }
}