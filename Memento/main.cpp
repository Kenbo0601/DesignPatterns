#include "textEditor.h"
#include "undoManager.h"
#include <iostream>

int main() {

    // Instantiate originator and caretaker classes
    TextEditor editor;
    UndoManager undoManager;

    // Steps for saving content:
    // 1: editor content variable copies the text 
    // 2: editor creates a new memento object with the content 
    // 3: undoManager saves the memento object in history stack  
    
    // write and save the first version
    editor.write("Hello world!");
    std::cout << "Content: " << editor.getContent() << std::endl;
    undoManager.save(editor.save()); // save the state

    // write and save the second version 
    editor.write("Hello, world! This is the Memento Pattern.");
    std::cout << "Content: " << editor.getContent() << std::endl;
    undoManager.save(editor.save()); // save the state

    // write and save the third version 
    editor.write("Final version of the text.");
    std::cout << "Content: " << editor.getContent() << std::endl;
    undoManager.save(editor.save()); // save the state


    // steps for retrieving contents
    // 1: undoManager looks at the history stack, and gets the most recent content (memento obj)
    // 2: editor sets the content to this memento obj 

    // Undo the last action 
    editor.restore(undoManager.undo());
    std::cout << "After undo: " << editor.getContent() << std::endl; 

    // Undo again
    editor.restore(undoManager.undo());
    std::cout << "After second undo: " << editor.getContent() << std::endl; 

    return 0;
}