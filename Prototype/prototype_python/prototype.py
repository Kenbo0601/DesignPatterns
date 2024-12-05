from abc import ABC, abstractmethod
import copy

class Prototype(ABC):
    @abstractmethod
    def clone(self):
        """Create a copy of the object"""
        pass

class Car(Prototype):
    def __init__(self, model, color, features=None):
        self.model = model
        self.color = color
        self.features = features if features else []

    def add_feature(self, feature):
        self.features.append(feature)

    def __str__(self):
        return f"Car(model={self.model}, color={self.color}, features={self.features})"

    def clone(self):
        # Use deepcopy to clone the object to ensure nested objects are copied
        return copy.deepcopy(self)

if __name__ == "__main__":
    # Create a prototype car
    prototype_car = Car(model="Sedan", color="Red")
    prototype_car.add_feature("Air Conditioning")
    prototype_car.add_feature("Sunroof")

    print("Prototype Car:", prototype_car)

    # Clone the prototype car
    cloned_car = prototype_car.clone()
    cloned_car.color = "Blue"  # Modify the cloned car's color
    cloned_car.add_feature("GPS")  # Add a new feature to the cloned car

    print("Cloned Car:", cloned_car)
    print("Prototype Car After Cloning:", prototype_car)
