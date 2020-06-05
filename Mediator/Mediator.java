//Concrete Mediator
//aware of all of the colleagues and their purposes 

class Mediator implements EventListenerIF {
    Finger [] finger;
    Mediator(Finger [] finger) { this.finger = finger; }
    public void handleEvent(Event event) {
        int source = event.source;
        int value = event.value;
        int increment = (value + 3) / 6;
        for(int i=0; i<finger.length; i++)
            if(i != source) 
                finger[i].pressure += increment;
       finger[source].pressure += value - 3 * increment; 
       printFingers();
    }
    void printFingers() {
        System.out.print("Fingers: ");
        for(int i=0; i<finger.length; i++)
            System.out.format("%3d: ", finger[i].pressure);
        System.out.println();
    }
}
