
class Client implements EnvironmentIF {
    public static void main(String [] args) {
        new Client().execute(args[0]);
    }

    void execute(String mediaType) {
        try {
            Class<?>clazz = Class.forName(mediaType);
            MediaIF media = (MediaIF) clazz.getDeclaredConstructor().newInstance();

            media.setEnvironment(this);
            media.render();
        } catch (ClassNotFoundException ex) {
            System.out.println("Sorry format not available");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void pay() {
        System.out.println("Paying 10 cents");
    }
}
