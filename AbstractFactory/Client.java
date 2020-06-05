class Client {
    void make_bathroom(AbstractFactory af) {
        SinkIF sink = af.createSink();
        ToiletIF toilet = af.createToilet(); 
        System.out.println(sink); 
        System.out.println(toilet);
    }
}