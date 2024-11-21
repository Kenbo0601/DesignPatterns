#ifndef PROXY_H
#define PROXY_H
#include "AbstractSubject.h"
#include "RealSubject.h"
#include <memory>

// Proxy Class 
class Proxy : public AbstractSubject
{
    private:
        std::unique_ptr<RealSubject> realSubject; // pointer to RealSubject class 
    public:
        void request() override;
};

#endif