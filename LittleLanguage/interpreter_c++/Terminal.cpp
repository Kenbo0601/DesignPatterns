#include "Terminal.h"

Number::Number(int value)
{
    this->value = value;
}

int Number::interpret()
{
    return this->value;
}