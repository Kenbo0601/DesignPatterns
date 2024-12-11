'''
The State Design Pattern is a behavioral design pattern that allows 
an object to change its behavior dynamically based on its internal state.
The object appears to alter its class when the state changes, but in reality, the change is managed by delegating the behavior to different
state objects.

State vs Strategy pattern
State:
 - Context often changes state objects
 - States act differently
 - Client see the change in behavior 
Strategy:
 - Context usually contains just one strategy object
 - Strategies all do the same thing
 - Client do not see change in behavior of Context
'''

from abc import ABC, abstractmethod

# State Interface
# Defines the interface for state-specific behavior
class TrafficLightState(ABC):
    @abstractmethod
    def handle_request(self, context):
        pass


# Concrete States
# Implements state-specific behavior
class RedState(TrafficLightState):
    def handle_request(self, context):
        print("Red light: Stop!")
        context.set_state(GreenState())  # Transition to Green

class GreenState(TrafficLightState):
    def handle_request(self, context):
        print("Green light: Go!")
        context.set_state(YellowState())  # Transition to Yellow

class YellowState(TrafficLightState):
    def handle_request(self, context):
        print("Yellow light: Slow down!")
        context.set_state(RedState())  # Transition to Red


# Context class
# maintains a fereference to the current state
# delegates requests to the state object
class TrafficLightContext:
    def __init__(self):
        self._state = RedState()  # Initial state

    def set_state(self, state):
        self._state = state

    def request(self):
        self._state.handle_request(self)


if __name__ == "__main__":
    traffic_light = TrafficLightContext()

    # Simulate traffic light behavior
    for _ in range(5):
        traffic_light.request()
