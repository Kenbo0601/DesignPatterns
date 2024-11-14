// main.cpp
#include "ElectricCar.h"
#include "GasCar.h"
#include "GasCarAdapter.h"
#include <iostream>

void charge_car(ElectricCar* car) {
    car->charge_battery();
}

int main() {
    ElectricCar* electric_car = nullptr;    // No electric car instance for now
    GasCar gas_car;                         // Create an instance of GasCar
    GasCarAdapter gas_car_adapter(&gas_car); // Create an adapter for GasCar

    // Use the GasCarAdapter as if it’s an ElectricCar
    std::cout << "Charging gas car using adapter:" << std::endl;
    charge_car(&gas_car_adapter);

    return 0;
}
