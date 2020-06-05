class Bathroom {
    SinkIF sink;
    ToiletIF toilet;
    Bathroom(SinkIF sink, ToiletIF toilet) {
        this.sink = sink; this.toilet = toilet;
    }
    public String toString() {
        return "Bathroom: " + sink + ", " + toilet;
    }
}