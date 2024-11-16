#include "Leaf.h"
#include<iostream>
#include<string>

Leaf::Leaf(const std::string& name) 
{
    this->name = name;
}

void Leaf::show_details() const 
{
    std::cout << "Leaf: " << this->name << std::endl;
}