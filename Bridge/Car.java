class Car {
    CarImplIF implementation = new GasolineCar();
    void refuel() {
        implementation.refuel();
    }
    void goGreen() {
        implementation = new ElectricCar();
    }
}