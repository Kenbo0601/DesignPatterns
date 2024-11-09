#include "Receiver.h"
#include "Invoker.h"
#include "Command.h"

/* Implementation of Command Design Pattern */
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

    remote.setCommand(&adjustVolume);
    remote.pressButton(); // Output: Volume Adjusted 

    remote.setCommand(&changeChannnel);
    remote.pressButton(); // Output: Channel Changed

    remote.setCommand(&turnOffTVCommand);
    remote.pressButton(); // Output: TV is now OFF

    return 0;
}

