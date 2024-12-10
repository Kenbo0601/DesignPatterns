from abc import ABC, abstractmethod

# Mediator Interface 
class ChatroomMediator(ABC):
    @abstractmethod
    def show_message(self, user, message):
        pass

# Concrete Mediator 
class Chatroom(ChatroomMediator):
    def show_message(self, user, message):
        print(f"[{user.get_name()}]: {message}")

# Colleagues
class User:
    def __init__(self, name, chatroom):
        self.name = name
        self.chatroom = chatroom  # Mediator

    def get_name(self):
        return self.name

    def send_message(self, message):
        self.chatroom.show_message(self, message)

# Client Code
if __name__ == "__main__":
    # Create a chatroom (mediator)
    chatroom = Chatroom()

    # Create users (colleagues)
    user1 = User("Alice", chatroom)
    user2 = User("Bob", chatroom)

    # Users send messages via the chatroom
    user1.send_message("Hi Bob!")
    user2.send_message("Hello Alice!")
