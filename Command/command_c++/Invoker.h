// Invoker.h
#ifndef INVOKER_H
#define INVOKER_H

#include "Command.h"
#include<string>


class RemoteControl {
    private:
        Command *command;
    public:
        void setCommand(Command *command);
        void pressButton();
};

#endif