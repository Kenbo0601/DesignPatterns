#include "Branch.h"
#include <iostream>

Branch::Branch(const std::string& name)
{
    this->name = name;
}

void Branch::add_child(std::shared_ptr<TreeComponent> child)
{
    children.push_back(child);
}

void Branch::show_details() const 
{
    std::cout << "Branch: " << name << std::endl;
    for(const auto& child : children) child->show_details();
}