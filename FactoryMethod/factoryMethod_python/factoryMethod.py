from abc import ABC

# Abstract Product
class Pizza(ABC):
    # abstract base class for all pizzas
    def prepare(self):
        pass

# Concrete Products
class CheesePizza(Pizza):
    # Concrete Implementation of a Cheese Pizza
    def prepare(self):
        print("Preparing Cheese Pizza!")

class PepperoniPizza(Pizza):
    # Concrete Implementation of a Pepperoni Pizza
    def prepare(self):
        print("Preparing Pepperoni Pizza!")

# Abstract Creator
class PizzaStore(ABC):
    # factory method to create a pizza
    def create_pizza(self, pizza_type):
        pass
    # general logic for ordering a pizza
    def order_pizza(self, pizza_type):
        pizza = self.create_pizza(pizza_type)
        pizza.prepare()
        return pizza

# Concrete Creator
class NewYorkPizzaStore(PizzaStore):
    def create_pizza(self, pizza_type):
        if pizza_type == "cheese":
            return CheesePizza()
        elif pizza_type == "pepperoni":
            return PepperoniPizza()
        else:
            raise ValueError(f"Unknown pizza type: {pizza_type}")

if __name__ == "__main__":
    # Create a New York Pizza Store
    ny_pizza_store = NewYorkPizzaStore()

    # Order a cheese pizza
    print("Ordering a Cheese Pizza:")
    ny_pizza_store.order_pizza("cheese")

    print("\nOrdering a Pepperoni Pizza:")
    ny_pizza_store.order_pizza("pepperoni")

    # Uncomment to test an unknown pizza type
    # ny_pizza_store.order_pizza("veggie")
