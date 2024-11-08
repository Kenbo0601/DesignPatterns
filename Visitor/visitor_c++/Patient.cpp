// Patient.cpp
#include "Patient.h"
#include "Visitor.h"

// accept method implementation for General Patient Class 
void GeneralPatient::accept(MedicalStaffVisitor &visitor){
    visitor.visit_general_patient(this);
}

// accept method implementation for Emergency Patient Class 
void EmergencyPatient::accept(MedicalStaffVisitor &visitor){
    visitor.visit_emergency_patient(this);
}

// accept method implementation for ICU Patient Class 
void ICUPatient::accept(MedicalStaffVisitor &visitor){
    visitor.visit_icu_patient(this);
}



