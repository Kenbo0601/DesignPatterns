#ifndef TERMINAL_H
#define TERMINAL_H
#include "Expression.h"

// Terminal expression: a number
class Number : public Expression
{
    private:
        int value;
    public:
        Number(int value);
        int interpret() override;
};

#endif