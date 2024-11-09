#include "Command.h"

// TurnOnCommand class implementation 
// Constructor 
TurnOnCommand::TurnOnCommand(Device *device) {
    this->device = device;
}

void TurnOnCommand::execute() {
    device->turnOn(); // invoke receiver child classes: divice is either TV or Stereo 
}

// TurnOffCommand class implementation 
// Constructor 
TurnOffCommand::TurnOffCommand(Device *device) {
    this->device = device;
}

void TurnOffCommand::execute() {
    device->turnOff(); // invoke receiver child classes: divice is either TV or Stereo 
}

// ChangeChannelCommand class implementation 
// Constructor 
ChangeChannelCommand::ChangeChannelCommand(TV *tv) {
    this->tv = tv;
}

void ChangeChannelCommand::execute() {
    tv->changeChannel(); // invoke receiver child class TV 
}

// AdjustVolumeCommand class implementation 
// Constructor 
AdjustVolumeCommand::AdjustVolumeCommand(Stereo *stereo) {
    this->stereo = stereo;
}

void AdjustVolumeCommand::execute() {
    stereo->adjustVolume(); // invoke receiver child class Stereo
}

