// ElectricCar.h
#ifndef ELECTRICCAR_H
#define ELECTRICCAR_H

// Target Interface 
class ElectricCar 
{
    public:
        virtual void charge_battery() = 0; // pure virtual method 
        virtual ~ElectricCar() = default; // virtual destructor 
};

#endif