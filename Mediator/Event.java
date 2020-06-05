class Event {
    static int next_id = 0;
    int id;
    int source;
    int value;
    Event(int source, int value) {
        id = next_id++;
        this.source = source;
        this.value = value;
    }
    public String toString() {
        return "Event: " + id + " " + source + " " + value;
    }
}
