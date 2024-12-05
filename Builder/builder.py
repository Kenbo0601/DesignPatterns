from abc import ABC, abstractmethod

# Product - the object that we are building
class Car:
    def __init__(self):
        self.color = None
        self.engine = None
        self.wheels = None
        self.has_gps = False
        self.has_sunroof = False

    def __str__(self):
        return (
            f"Car [Color={self.color}, Engine={self.engine}, Wheels={self.wheels}, "
            f"GPS={self.has_gps}, Sunroof={self.has_sunroof}]"
        )

# Builder Interface - defines the steps to build the car
class CarBuilder(ABC):
    @abstractmethod
    def set_color(self, color):
        pass

    @abstractmethod
    def set_engine(self, engine):
        pass

    @abstractmethod
    def set_wheels(self, wheels):
        pass

    @abstractmethod
    def add_gps(self, has_gps):
        pass

    @abstractmethod
    def add_sunroof(self, has_sunroof):
        pass

    @abstractmethod
    def get_car(self):
        pass


# Concrete Builder - implements the steps defined in the Builder Interface
class ConcreteCarBuilder(CarBuilder):
    def __init__(self):
        self.car = Car()

    def set_color(self, color):
        self.car.color = color

    def set_engine(self, engine):
        self.car.engine = engine

    def set_wheels(self, wheels):
        self.car.wheels = wheels

    def add_gps(self, has_gps):
        self.car.has_gps = has_gps

    def add_sunroof(self, has_sunroof):
        self.car.has_sunroof = has_sunroof

    def get_car(self):
        return self.car


# Director - orchestrates the building process
class CarDirector:
    def __init__(self, builder: CarBuilder):
        self.builder = builder

    # function for building sports car
    def build_sports_car(self):
        self.builder.set_color("Red")
        self.builder.set_engine("V8 Engine")
        self.builder.set_wheels(4)
        self.builder.add_gps(True)
        self.builder.add_sunroof(True)

    # function for building economy car
    def build_economy_car(self):
        self.builder.set_color("White")
        self.builder.set_engine("V4 Engine")
        self.builder.set_wheels(4)
        self.builder.add_gps(False)
        self.builder.add_sunroof(False)


if __name__ == "__main__":
    # Create a builder
    builder = ConcreteCarBuilder()
    
    # Create a director
    director = CarDirector(builder)
    
    # Build a sports car
    director.build_sports_car()
    sports_car = builder.get_car()
    print(sports_car)
    
    # Build an economy car
    builder = ConcreteCarBuilder()  # Reset the builder
    director = CarDirector(builder)
    director.build_economy_car()
    economy_car = builder.get_car()
    print(economy_car)
