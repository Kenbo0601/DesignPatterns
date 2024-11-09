// Command.h
#ifndef COMMAND_H
#define COMMAND_H

#include "Receiver.h"

// Command Interface 
class Command {
    public:
        virtual void execute() = 0;
        virtual ~Command() = default;
};

// Concrete Command classes
class TurnOnCommand : public Command {
    private:
        Device *device;
    public:
        TurnOnCommand(Device *device);
        void execute() override;
};

class TurnOffCommand : public Command {
    private:
        Device *device;
    public:
        TurnOffCommand(Device *device);
        void execute() override;
};

class ChangeChannelCommand : public Command {
    private:
        TV *tv;
    public:
        ChangeChannelCommand(TV *tv);
        void execute() override;
};

class AdjustVolumeCommand : public Command {
    private:
        Stereo *stereo;
    public:
        AdjustVolumeCommand(Stereo *stereo);
        void execute() override;
};

#endif // COMMAND_H

