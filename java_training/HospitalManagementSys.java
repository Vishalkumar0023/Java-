// 2.⁠ ⁠Hospital Management System
// Create a hospital management system.
// Requirements:
// •⁠  ⁠Create an abstract Doctor class.
// •⁠  ⁠Store doctor name and consultation fee privately.
// •⁠  ⁠Initialize them through a constructor.
// •⁠  ⁠Create an abstract method treatPatient().
// •⁠  ⁠Create a concrete method displayDoctor().
// •⁠  ⁠Create:
//           o	Cardiologist
//           o	Dentist
// •⁠  ⁠Each doctor should implement treatPatient() differently.
// •⁠  ⁠Create a method to calculate final consultation fee after a discount.

abstract class Doctor {
    private String name;
    private double consultationFees;

    Doctor(String name, double consultationFees) {
        this.name = name;
        this.consultationFees = consultationFees;
    }

    public String getName() {
        return name;
    }

    public double getConsultationFees() {
        return consultationFees;
    }

    abstract void treatPatient();

    public void displayDoctor() {
        System.out.println("Doctor Name: " + getName());
        System.out.println("Consultation Fees: " + getConsultationFees());
    }

    abstract double calculateFinalFee();
}

class Cardiologist extends Doctor {
    Cardiologist(String name, double consultationFees) {
        super(name, consultationFees);
    }

    public void treatPatient() {
        System.out.println("Treating heart-related problems");
    }

    public double calculateFinalFee() {
        double discount = 0.20 * getConsultationFees();
        return getConsultationFees() - discount;
    }
}

class Dentist extends Doctor {
    Dentist(String name, double consultationFees) {
        super(name, consultationFees);
    }

    public void treatPatient() {
        System.out.println("Treating dental problems");
    }

    public double calculateFinalFee() {
        double discount = 0.40 * getConsultationFees();
        return getConsultationFees() - discount;
    }
}

public class HospitalManagementSys {
    public static void main(String[] args) {
        Cardiologist c1 = new Cardiologist("Dr Vishal", 2000);
        Dentist d1 = new Dentist("Dr Rohit", 3000);
        c1.displayDoctor();
        c1.treatPatient();
        System.out.println("Final Consultation Fees after Discount: " + c1.calculateFinalFee());
        System.out.println("----------------------------------------------------");
        d1.displayDoctor();
        d1.treatPatient();
        System.out.println("Final Consultation Fees after Discount: " + d1.calculateFinalFee());
    }
}