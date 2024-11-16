#include "Branch.h"
#include "Leaf.h"
#include <iostream>

int main()
{
     // Create branches and leaves
    auto root = std::make_shared<Branch>("Root");
    auto branch1 = std::make_shared<Branch>("Branch1");
    auto branch2 = std::make_shared<Branch>("Branch2");

    auto leaf1 = std::make_shared<Leaf>("Leaf1");
    auto leaf2 = std::make_shared<Leaf>("Leaf2");
    auto leaf3 = std::make_shared<Leaf>("Leaf3");

    // Build tree structure
    branch1->add_child(leaf1);
    branch1->add_child(leaf2);

    branch2->add_child(leaf3);

    root->add_child(branch1);
    root->add_child(branch2);

    // Display details of the entire structure
    root->show_details();

    return 0;
}