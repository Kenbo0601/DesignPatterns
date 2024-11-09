#include "Invoker.h"

// Constructor 
void RemoteControl::setCommand(Command *command) {
    this->command = command;
}

// execute concrete command classes
void RemoteControl::pressButton() {
    command->execute();
}

