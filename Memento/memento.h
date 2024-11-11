// MEMENTO_H
#ifndef MEMENTO_H
#define MEMENTO_H

#include<string>

// *** Memento class ***
// stores the state of the Originator (textEditor)
class Memento {
    private:
        std::string state;
    public:
        Memento(const std::string &state);
        std::string getState() const;
};


#endif // MEMENTO_H