// Visitor.cpp
#include "Visitor.h"
#include "Patient.h"
#include <iostream>

// Nurse implementation
// visit function for general patient
void Nurse::visit_general_patient(GeneralPatient *patient) {
    std::cout << "Nurse checks the vitals of a general patient." << std::endl;
}

// visit function for emegency patient
void Nurse::visit_emergency_patient(EmergencyPatient *patient) {
    std::cout << "Nurse stabilizes the emergency patient and prepares for the doctor." << std::endl;
}

// visit function for icu patient
void Nurse::visit_icu_patient(ICUPatient *patient) {
    std::cout << "Nurse monitors ICU patient's life-support system." << std::endl;
}


// Doctor implementation
// visit function for general patient 
void Doctor::visit_general_patient(GeneralPatient *patient) {
    std::cout << "Doctor reviews the general patient's symptoms and prescribes medication." << std::endl;
}

// visit function for emergency patient
void Doctor::visit_emergency_patient(EmergencyPatient *patient) {
    std::cout << "Doctor performs emergency surgery on the patient." << std::endl;
}

// visit function for icu patient
void Doctor::visit_icu_patient(ICUPatient *patient) {
    std::cout << "Doctor adjusts the ICU patient's treatment plan." << std::endl;
}


