// Invoker.h
#ifndef INVOKER_H
#define INVOKER_H

#include "Command.h"
#include<string>

// RemoteControl Class - act as an Invoker 
// This class stores a reference to a Command Object and provides the pressButton() method 
// to execute the command. 
class RemoteControl {
    private:
        Command *command;
    public:
        void setCommand(Command *command);
        void pressButton();
};

#endif