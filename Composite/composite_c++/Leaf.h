#ifndef LEAF_H
#define LEAF_H
#include "TreeComponent.h"
#include <string>

// Leaf class representing an individual leaf
class Leaf : public TreeComponent 
{
    private:
        std::string name;
    public:
        Leaf(const std::string& name);
        void show_details() const override;
};

#endif