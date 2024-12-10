'''
The Template Design Pattern is a behavioral design pattern that defines 
the structure of an algorithm in a base class (template method) but allows
its implementation details to be modified in subclasses.
This pattern ensures that the overall algorithm's structure remains consistent
while letting subclasses define specific steps.

+--------------------+
| AbstractClass      |
+--------------------+
| + templateMethod() | <-- Defines algorithm structure
| + step1()          | <-- Default or abstract
| + step2()          | <-- Abstract
+--------------------+
           ^
           |
+---------------------+
| ConcreteClass       |
+---------------------+
| + step2()           | <-- Implements specific steps
+---------------------+

'''

from abc import ABC, abstractmethod

# Abstract Class
class Beverage(ABC):
    # Template method (defines the algorithm structure)
    def prepare_recipe(self):
        self.boil_water()
        self.brew()
        self.pour_in_cup()
        self.add_condiments()

    def boil_water(self):
        print("Boiling water")

    def pour_in_cup(self):
        print("Pouring into cup")

    # Abstract methods to be implemented by subclasses
    @abstractmethod
    def brew(self):
        pass

    @abstractmethod
    def add_condiments(self):
        pass

# Concrete Class: Tea
class Tea(Beverage):
    def brew(self):
        print("Steeping the tea")

    def add_condiments(self):
        print("Adding lemon")

# Concrete Class: Coffee
class Coffee(Beverage):
    def brew(self):
        print("Dripping coffee through filter")

    def add_condiments(self):
        print("Adding sugar and milk")


if __name__ == "__main__":
    print("Making tea:")
    tea = Tea()
    tea.prepare_recipe()

    print("\nMaking coffee:")
    coffee = Coffee()
    coffee.prepare_recipe()
