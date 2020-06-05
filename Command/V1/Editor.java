class Editor {
    StringBuffer buffer = new StringBuffer("Hello world");
    CommandIF [] command = {
        new Insert(3,'*'),
        new Delete(6),
    };

    void simulate() {
        System.out.println(buffer);
        for(CommandIF c : command) {
            c.execute(buffer);
            System.out.println(buffer);
        }
    }
}