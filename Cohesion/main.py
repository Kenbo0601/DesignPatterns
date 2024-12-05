# Cohesion Pattern 
# High Cohesion example:
# Each class has a single responsibility

# UserService class is only focusing on handling users 
class UserService:
    def __init__(self):
        self.database = {}

    # responsible for creating users
    def create_user(self, username, password):
        self.database[username] = password
        print(f"Creating User: {username}")

    # responsible for resetting password 
    def reset_password(self,username, new_password):
        self.database[username] = new_password
        print(f"Resetting password for user: {username}")
    
    def print_database(self):
        print("\nPrinting user info in database")
        for user in self.database:
            print(user, ":",self.database[user])
    
# Client code
if __name__ == "__main__":
    user_service = UserService()
    # Create users
    user_service.create_user("Kenichi Sakamoto","12345")
    user_service.create_user("Bill Gates","11112")
    user_service.create_user("Elon Musk","99999")
    # print users
    user_service.print_database()

    # reset password for Elon Musk
    user_service.reset_password("Elon Musk", "34321")
    user_service.print_database()
