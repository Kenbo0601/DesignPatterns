#include "NonTerminal.h"

// Add class Implementation 
Add::Add(std::shared_ptr<Expression> left, std::shared_ptr<Expression> right)
{
    this->left = left;
    this->right = right;
}

int Add::interpret()
{
    return this->left->interpret() + this->right->interpret(); 
}

// Mult class Implementation
Mult::Mult(std::shared_ptr<Expression> left, std::shared_ptr<Expression> right)
{
    this->left = left;
    this->right = right;
}

int Mult::interpret()
{
    return this->left->interpret() * this->right->interpret(); 
}