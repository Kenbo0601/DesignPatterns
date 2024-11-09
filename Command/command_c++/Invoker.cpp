#include "Invoker.h"

void RemoteControl::setCommand(Command *command) {
    this->command = command;
}

void RemoteControl::pressButton() {
    command->execute();
}