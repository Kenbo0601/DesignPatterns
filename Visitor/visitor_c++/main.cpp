// Main.cpp
#include <iostream>
#include <vector>
#include <memory>
#include "Patient.h"
#include "Visitor.h"

int main() {
    // Create a list of patients
    std::vector<std::unique_ptr<Patient>> patients;
    patients.push_back(std::make_unique<GeneralPatient>());
    patients.push_back(std::make_unique<EmergencyPatient>());
    patients.push_back(std::make_unique<ICUPatient>());

    // Create instances of visitors
    Nurse nurse;
    Doctor doctor;

    // Each medical staff member visits each patient
    std::cout << "Nurse's shift:" << std::endl;
    for (auto &patient : patients) {
        patient->accept(nurse);
    }

    std::cout << "\nDoctor's shift:" << std::endl;
    for (auto &patient : patients) {
        patient->accept(doctor);
    }

    return 0;
}
