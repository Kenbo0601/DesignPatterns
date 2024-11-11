// testEditor.h
#ifndef TEXTEDITOR_H
#define TEXTEDITOR_H

#include <string>
#include <memory>
#include "memento.h"

// *** Originator class ***
// has a state and can create mementos to save its state 
// or restore from a memento
class TextEditor {
    private:
        std::string content;
    public:
        void write(const std::string &text);
        std::string getContent() const;
        std::shared_ptr<Memento> save() const;
        void restore(const std::shared_ptr<Memento> &memento);
};

#endif