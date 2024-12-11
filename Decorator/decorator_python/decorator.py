'''
The Decorator Design Pattern is a structural design pattern that 
dynamically adds new behavior or responsibilities to an object without 
modifying its original structure. It wraps an object with one or more
decorator classes that add functionality, making it a flexible alternative
to subclassing for extending behavior.
'''

from abc import ABC, abstractmethod

# Component Interface
class Coffee(ABC):
    @abstractmethod
    def cost(self):
        pass

    @abstractmethod
    def description(self):
        pass

# Concrete Component
class SimpleCoffee(Coffee):
    def cost(self):
        return 5  # Base price of coffee

    def description(self):
        return "Simple coffee"

# Decorator
class CoffeeDecorator(Coffee):
    def __init__(self, coffee):
        self._coffee = coffee

    def cost(self):
        return self._coffee.cost()

    def description(self):
        return self._coffee.description()

# Concrete Decorators 
class MilkDecorator(CoffeeDecorator):
    def cost(self):
        return self._coffee.cost() + 1  # Add cost for milk

    def description(self):
        return self._coffee.description() + ", milk"

class SugarDecorator(CoffeeDecorator):
    def cost(self):
        return self._coffee.cost() + 0.5  # Add cost for sugar

    def description(self):
        return self._coffee.description() + ", sugar"


if __name__ == "__main__":
    # Start with a simple coffee
    coffee = SimpleCoffee()
    print(f"{coffee.description()} costs ${coffee.cost()}")

    # Add milk
    coffee = MilkDecorator(coffee)
    print(f"{coffee.description()} costs ${coffee.cost()}")

    # Add sugar
    coffee = SugarDecorator(coffee)
    print(f"{coffee.description()} costs ${coffee.cost()}")
