#include "Command.h"

// TurnOnCommand class implementation 
TurnOnCommand::TurnOnCommand(Device *device) {
    this->device = device;
}

void TurnOnCommand::execute() {
    device->turnOn();
}

// TurnOffCommand class implementation 
TurnOffCommand::TurnOffCommand(Device *device) {
    this->device = device;
}

void TurnOffCommand::execute() {
    device->turnOff();
}

// ChangeChannelCommand class implementation 
ChangeChannelCommand::ChangeChannelCommand(TV *tv) {
    this->tv = tv;
}

void ChangeChannelCommand::execute() {
    tv->changeChannel();
}

// AdjustVolumeChannel class implementation 
AdjustVolumeCommand::AdjustVolumeCommand(Stereo *stereo) {
    this->stereo = stereo;
}
