from abc import ABC, abstractmethod

# Abstract Handler
class SupportHandler(ABC):
    def __init__(self, next_handler=None):
        self.next_handler = next_handler

    def set_next(self, handler):
        self.next_handler = handler
        return handler

    @abstractmethod
    def handle_request(self, request):
        pass


# Concrete Handlers
class SupportAgent(SupportHandler):
    def handle_request(self, request):
        if request["level"] == "Low":
            print(f"Support Agent is handling the request: {request['message']}")
        elif self.next_handler:
            self.next_handler.handle_request(request)


class Supervisor(SupportHandler):
    def handle_request(self, request):
        if request["level"] == "Medium":
            print(f"Supervisor is handling the request: {request['message']}")
        elif self.next_handler:
            self.next_handler.handle_request(request)


class Manager(SupportHandler):
    def handle_request(self, request):
        if request["level"] == "High":
            print(f"Manager is handling the request: {request['message']}")
        elif self.next_handler:
            self.next_handler.handle_request(request)


# Client Code
if __name__ == "__main__":
    # Build the chain of responsibility
    manager = Manager()
    supervisor = Supervisor()
    support_agent = SupportAgent()

    support_agent.set_next(supervisor).set_next(manager)

    # Sample customer requests
    requests = [
        {"level": "Low", "message": "Password reset issue."},
        {"level": "Medium", "message": "System not responding."},
        {"level": "High", "message": "Major outage in production system."},
        {"level": "Critical", "message": "Unhandled request type."},  # No handler for this
    ]

    # Process the requests through the chain
    for req in requests:
        print(f"Processing request: {req['message']}")
        support_agent.handle_request(req)
        print()
