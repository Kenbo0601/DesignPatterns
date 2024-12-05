# Facade - Home Automation System 


# Subsystem Classes - individual components 
class Light:
    def turn_on(self):
        print("Lights turned on")

    def turn_off(self):
        print("Lights turned off")


class AirConditioner:
    def turn_on(self):
        print("Air conditioner turned on")

    def turn_off(self):
        print("Air conditioner turned off")


class MusicSystem:
    def play_music(self):
        print("Playing music")

    def stop_music(self):
        print("Music stopped")


# Facade - manage subsystems (subsystems don't know the existance of facade)
class HomeAutomationFacade:
    def __init__(self):
        self.light = Light()
        self.ac = AirConditioner()
        self.music_system = MusicSystem()

    def start_party_mode(self):
        print("Starting Party Mode:")
        self.light.turn_on()
        self.ac.turn_on()
        self.music_system.play_music()

    def stop_party_mode(self):
        print("Stopping Party Mode:")
        self.music_system.stop_music()
        self.ac.turn_off()
        self.light.turn_off()


if __name__ == "__main__":
    home_facade = HomeAutomationFacade()
    
    # Start the party mode
    home_facade.start_party_mode()
    
    print("\n--- Party is over ---\n")
    
    # Stop the party mode
    home_facade.stop_party_mode()
