#include "undoManager.h"
#include <iostream>

// Save a memento to the history vector
void UndoManager::save(const std::shared_ptr<Memento> &memento) {
    history.push_back(memento);
}

// Retrieve the most recent memento from the vector
std::shared_ptr<Memento> UndoManager::undo() {
    if(!history.empty()) {
        auto memento = history.back();
        history.pop_back();
        return memento;
    }
    else {
       return nullptr; 
    }
}