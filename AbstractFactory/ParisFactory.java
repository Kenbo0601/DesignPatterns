class ParisFactory implements AbstractFactory {
    public SinkIF createSink() {
        return new ParisSink();
    }

    public ToiletIF createToilet() {
        return new ParisToilet();
    }
}