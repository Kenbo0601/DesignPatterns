// GasCarAdapter.cpp
#include "GasCarAdapter.h"
#include <iostream>

GasCarAdapter::GasCarAdapter(GasCar* car) 
{
    gasCar = car;
}

void GasCarAdapter::charge_battery()
{
    std::cout << "Adapting to charge battery interface ... " << std::endl;
    gasCar->fill_gas_tank(); // Call the adaptee's method
}