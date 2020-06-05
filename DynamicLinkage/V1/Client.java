class Client {
    public static void main(String [] args) {
        try {
            Class<?>clazz = Class.forName(args[0]);
            MediaIF media = (MediaIF) clazz.getDeclaredConstructor().newInstance();
            media.render();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
