#ifndef TREECOMPONENT_H
#define TREECOMPONENT_H

// Base class for both branches and leaves
class TreeComponent {
    public:
        virtual void show_details() const = 0;
};

#endif