class RomanFactory implements AbstractFactory {
    public SinkIF createSink() {
        return new RomanSink();
    }

    public ToiletIF createToilet() {
        return new RomanToilet();
    }

}