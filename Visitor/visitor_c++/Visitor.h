// Visitor.h 
#ifndef VISITOR_H
#define VISITOR_H

class GeneralPatient;
class EmergencyPatient;
class ICUPatient;

// Visitor Interface 
class MedicalStaffVisitor {
    public:
        virtual void visit_general_patient(GeneralPatient *patient) = 0;
        virtual void visit_emergency_patient(EmergencyPatient *patient) = 0;
        virtual void visit_icu_patient(ICUPatient *patient) = 0;
        virtual ~MedicalStaffVisitor() = default;
};

// Concrete Visitor: Nurse 
class Nurse : public MedicalStaffVisitor {
    public: 
        void visit_general_patient(GeneralPatient *patient) override;
        void visit_emergency_patient(EmergencyPatient *patient) override;
        void visit_icu_patient(ICUPatient *patient) override;
};

// Concrete Visitor: Doctor
class Doctor : public MedicalStaffVisitor {
    public:
        void visit_general_patient(GeneralPatient *patient) override;
        void visit_emergency_patient(EmergencyPatient *patient) override;
        void visit_icu_patient(ICUPatient *patient) override;
};

#endif