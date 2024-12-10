from abc import ABC, abstractmethod

# --- Abstract Products ---
# Interfaces for the products (Car and Boat) in each family 
class LandVehicle(ABC):
    @abstractmethod
    def drive(self):
        pass

class WaterVehicle(ABC):
    @abstractmethod
    def sail(self):
        pass

# --- Concrete Products ---
# Concrete products for land
class Car(LandVehicle):
    def drive(self):
        print("Driving a car on the road")

class Bike(LandVehicle):
    def drive(self):
        print("Riding a bike on the road")

# Concrete products for water
class Boat(WaterVehicle):
    def sail(self):
        print("Sailing a boat on the water")

class JetSki(WaterVehicle):
    def sail(self):
        print("Riding a jet ski on the water")


# --- Abstract Factory ---
class VehicleFactory(ABC):
    @abstractmethod
    def create_land_vehicle(self):
        pass

    @abstractmethod
    def create_water_vehicle(self):
        pass


# --- Concrete Factories ---
# Factory for land vehicles
class LandVehicleFactory(VehicleFactory):
    def create_land_vehicle(self):
        return Car()  # Produces a car

    def create_water_vehicle(self):
        raise NotImplementedError("Land factory cannot produce water vehicles")


# Factory for water vehicles
class WaterVehicleFactory(VehicleFactory):
    def create_land_vehicle(self):
        raise NotImplementedError("Water factory cannot produce land vehicles")

    def create_water_vehicle(self):
        return Boat()  # Produces a boat


# --- Client Code ---
class Application:
    def __init__(self, factory: VehicleFactory):
        self.factory = factory

    def use_land_vehicle(self):
        try:
            vehicle = self.factory.create_land_vehicle()
            vehicle.drive()
        except NotImplementedError as e:
            print(e)

    def use_water_vehicle(self):
        try:
            vehicle = self.factory.create_water_vehicle()
            vehicle.sail()
        except NotImplementedError as e:
            print(e)


if __name__ == "__main__":
    # Create a factory for land vehicles
    land_factory = LandVehicleFactory()
    app1 = Application(land_factory)
    print("--- Using Land Factory ---")
    app1.use_land_vehicle()  # Outputs: Driving a car on the road
    app1.use_water_vehicle()  # Outputs: Land factory cannot produce water vehicles

    # Create a factory for water vehicles
    water_factory = WaterVehicleFactory()
    app2 = Application(water_factory)
    print("\n--- Using Water Factory ---")
    app2.use_land_vehicle()  # Outputs: Water factory cannot produce land vehicles
    app2.use_water_vehicle()  # Outputs: Sailing a boat on the water
