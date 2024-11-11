// textEditor.cpp
#include "textEditor.h"
#include <iostream>

// copy content from text 
void TextEditor::write(const std::string &text) {
    content = text;
}

// return content 
std::string TextEditor::getContent() const {
    return content;
}

// return new memento class 
std::shared_ptr<Memento> TextEditor::save() const {
    // create a new Memento class with the current context
    // this will be saved in undoManager history stack
    return std::make_shared<Memento>(content);
    // equivalent way with a raw pointer is the following;
    // Memento *TextEditor::save() ... 
    // return new Memento(content)
}

// history stack in undoManager gets passed here as a parameter
void TextEditor::restore(const std::shared_ptr<Memento> &memento) {
    if(memento) content = memento->getState();
    else std::cout << "No memento to restore." << std::endl;
}

