// memento.cpp
#include "memento.h"

// Constructor
Memento::Memento(const std::string &state) {
    this->state = state;
}

// getState function - return state 
std::string Memento::getState() const {
    return state;
}

