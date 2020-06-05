//PrototypeFactory

//Holds each object of a family
//has method foreach object to clone it
//set products in constructor and/or method

class Prototype {
    SinkIF sink;
    ToiletIF toilet;
    void setProducts(SinkIF sink, ToiletIF toilet) {
        this.sink = sink;
        this.toilet = toilet;
    }
    SinkIF createSink(){
        return sink.clone();
    }
    ToiletIF createToilet() {
        return toilet.clone();
    }
}
