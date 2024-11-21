#include "Proxy.h"
#include <iostream>

void Proxy::request()
{
    std::cout << "Proxy: Logging the request before forwarding."  << std::endl;
    if(!realSubject) 
        realSubject = std::make_unique<RealSubject>();
    realSubject->request(); // forward the request to RealSubject
}