// Patient.h
#ifndef PATIENT_H
#define PATIENT_H

class MedicalStaffVisitor; // forward declaration of Visitor class 

// Element Interface 
class Patient {
    public:
        virtual void accept(MedicalStaffVisitor &visitor) = 0;
        virtual ~Patient() = default;
};

// Concrete Element 1 : General Patient 
class GeneralPatient : public Patient {
    public:
        void accept(MedicalStaffVisitor &visitor) override;
};

// Concrete Element 2 : Emergency Patient
class EmergencyPatient : public Patient {
    public:
        void accept(MedicalStaffVisitor &visitor) override;
};

// Concrete Element 3 : ICU Patient 
class ICUPatient : public Patient {
    public:
        void accept(MedicalStaffVisitor &visitor) override;
};


#endif