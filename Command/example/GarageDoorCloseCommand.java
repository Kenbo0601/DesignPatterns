//Concrete Command 
class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;
    GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.lightDown();
        garageDoor.down();
    }

    public void undo() {
        garageDoor.lightUp();
        garageDoor.up();

    }

}
