class Client {
    public static void main(String [] ignore) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        Command garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        remote.setCommand(0,lightOn,lightOff);
        remote.setCommand(1,garageDoorOpen,garageDoorClose);

        remote.onButtonPressed(0);
        remote.offButtonPressed(0);
        remote.undoButtonPressed();
        remote.onButtonPressed(1);
        remote.offButtonPressed(1);
        remote.undoButtonPressed();
    }
}
