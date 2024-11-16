#ifndef NONTERMINAL_H
#define NONTERMINAL_H
#include "Expression.h"
#include <memory>

// Non-terminal expression: an addition operation 
class Add : public Expression
{
    private:
        std::shared_ptr<Expression> left; 
        std::shared_ptr<Expression> right; 
    public:
        Add(std::shared_ptr<Expression> left, std::shared_ptr<Expression> right);
        int interpret() override;
};

// Non-terminal expression: an multiplication operation 
class Mult : public Expression
{
    private:
        std::shared_ptr<Expression> left; 
        std::shared_ptr<Expression> right; 
    public:
        Mult(std::shared_ptr<Expression> left, std::shared_ptr<Expression> right);
        int interpret() override;
};

#endif