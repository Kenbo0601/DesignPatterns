#ifndef EXPRESSION_H
#define EXPRESSION_H

// The Expression interface declares an interpret method
class Expression 
{
    public:
        virtual int interpret() = 0;
};

#endif