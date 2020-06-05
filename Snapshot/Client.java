class Client {
    public static void main(String [] ignore) {
        Caretaker caretaker = new Caretaker();
        Subject subject = new Subject();
        System.out.println(subject);

        caretaker.save("breakfast", subject.save());
        subject.data[0] = 6;
        System.out.println(subject);

        subject.data[1] = 7;
        System.out.println(subject);
        caretaker.save("lunch", subject.save());
        
        subject.restore(caretaker.restore("breakfast"));
        System.out.println(subject);

        subject.restore(caretaker.restore("lunch"));
        System.out.println(subject);
    }
}
