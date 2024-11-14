#ifndef GASCARADAPTER_H
#define GASCARADAPTER_H

#include "ElectricCar.h"
#include "GasCar.h"

class GasCarAdapter : public ElectricCar 
{
    private:
        GasCar* gasCar; // pointer to an instance of GasCar (adaptee)
    public:
        GasCarAdapter(GasCar* car); // constructor takes a GasCar object
        void charge_battery() override; // implement the charge_batttery method to adapt fill_gas_tank
};

#endif