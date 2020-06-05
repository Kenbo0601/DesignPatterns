
public class ElectricCar implements CarImplIF {
    public void refuel() {
        recharge_the_battery();
    }
    void recharge_the_battery() {
        System.out.println("Charge my battery");
    }
}