#include "Receiver.h"
#include "Invoker.h"
#include "Command.h"

int main() {

    // Create Receiver objects 
    TV tv;
    Stereo stereo;
    
    // Create Command objects
    TurnOnCommand turnOnTVCommand(&tv);
    TurnOffCommand turnOffTVCommand(&tv);
    ChangeChannelCommand changeChannnel(&tv);

    TurnOnCommand turnOnStereoCommand(&stereo);
    TurnOffCommand turnOffStereoCommand(&stereo);
    AdjustVolumeCommand adjustVolume(&stereo);

    // Create remote control
    RemoteControl remote;

    // Set and execute commands
    remote.setCommand(&turnOnTVCommand);
    remote.pressButton(); // Output: TV is now ON

    return 0;
}