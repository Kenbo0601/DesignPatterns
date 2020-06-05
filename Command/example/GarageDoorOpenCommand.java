//Concrete Command
class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;
    GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.lightUp();
        garageDoor.up();
    }

    public void undo() {
        garageDoor.lightDown();
        garageDoor.down();
    }
}
