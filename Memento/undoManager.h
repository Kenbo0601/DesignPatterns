// undoManager.h
#ifndef UNDOMANAGER_H
#define UNDOMANAGER_H

#include <vector>
#include <memory>
#include "memento.h"

// *** Caretaker class ***
// manages saved mementos, allowing retrieval of previous states. 
class UndoManager {
    private:
        std::vector<std::shared_ptr<Memento>> history;
    public:
        void save(const std::shared_ptr<Memento> &memento);
        std::shared_ptr<Memento> undo();
};

#endif // UNDOMANAGER_H