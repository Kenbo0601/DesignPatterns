class Client {
    void make_bathroom(Prototype pf) {
        SinkIF sink = pf.createSink();
        ToiletIF toilet = pf.createToilet();
        System.out.println(sink);
        System.out.println(toilet);
    }
}
