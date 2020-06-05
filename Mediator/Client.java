import java.util.Random;

class Client {
    public static void main(String [] ignore) {
        Finger [] finger = new Finger[4];
        EventListenerIF mediator = new Mediator(finger);
        for(int i=0; i<finger.length; i++) 
            finger[i] = new Finger(mediator);

        Random random = new Random(12345);
        for(int i = 0; i < 10; i++) {
            int source = random.nextInt(finger.length);
            int value = random.nextInt(101) - 50;
            Event event = new Event(source, value);
            System.out.println(event);
            mediator.handleEvent(event);
        }
    }
}
