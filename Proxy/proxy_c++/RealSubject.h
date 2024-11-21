#ifndef REALSUBJECT_H
#define REALSUBJECT_H
#include "AbstractSubject.h"

// Real Subject class
class RealSubject : public AbstractSubject
{
    public:
        void request() override;
};

#endif