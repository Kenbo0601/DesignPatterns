#include "AbstractSubject.h"
#include "Proxy.h"
#include <iostream>

// Client code 
void clientCode(AbstractSubject* subject)
{
    std::cout << "Client: Calling the request method on the subject..."  << std::endl;
    subject->request();
}

// Main function 
int main()
{
    Proxy proxy;
    clientCode(&proxy); // pass proxy as a parameter 
    return 0;
}