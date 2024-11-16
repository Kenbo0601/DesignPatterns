#include "Expression.h"
#include "Terminal.h"
#include "NonTerminal.h"
#include <iostream>


int main()
{
    // expression = 5 + (10 * 15) = 155
    auto expression = std::make_shared<Add>(
            std::make_shared<Number>(5), 
            std::make_shared<Mult>(std::make_shared<Number>(10), std::make_shared<Number>(15))
        );
    auto result = expression->interpret();
    std::cout << "Result: " << result << std::endl;
    return 0;
}