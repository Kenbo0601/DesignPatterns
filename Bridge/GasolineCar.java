
public class GasolineCar implements CarImplIF {
    public void refuel() { 
        fill_the_tank();
    }

    void fill_the_tank() {
        System.out.println("Fill my tank!");
    }
}