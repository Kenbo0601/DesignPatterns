#ifndef BRANCH_H
#define BRANCH_H
#include "TreeComponent.h"
#include <string>
#include <vector>
#include <memory>

// Composite class representing a branch, which can hold leaves or other branches
class Branch : public TreeComponent 
{
    private: 
        std::string name;
        // Vector of TreeComponent pointers to hold child children
        std::vector<std::shared_ptr<TreeComponent>> children; // same as vector<TreeComponent*> children
    public:
        Branch(const std::string& name);
        void add_child(std::shared_ptr<TreeComponent> child);
        void show_details() const override;
};

#endif 