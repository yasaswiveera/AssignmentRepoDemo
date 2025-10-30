// Name: Vaishnavi Madagiri
// Date: (put today’s date)
// Assignment: Sprint 1 - TC01 Positive Test Case
// Purpose: To test that the doctor can add a prescription and patient can log their dose

public class TestMedicationTracker {

    public static void main(String[] args) {

        System.out.println("===== TC01 - Positive Test Case =====");
        System.out.println("Preconditions: app is running and patient P1 already exists");
        System.out.println("-------------------------------------");

        // create tracker for patient P1 (this is from the MedicationTracker class)
        MedicationTracker tracker = new MedicationTracker("P1");

        // Step 1: doctor adds prescription
        System.out.println("Step 1: Doctor adds prescription");
        tracker.addPrescription("Amoxicillin", "500 mg", "Dr. Smith");
        // should print “Prescription created and sent to patient P1.”

        // Step 2: patient logs dose taken
        System.out.println("Step 2: Patient logs dose taken");
        tracker.logDose(true, "08:00", "500 mg");
        // should print “Dose log saved: took=YES, time=08:00, dose=500 mg”

        // Step 3: view dose history
        System.out.println("Step 3: View dose history");
        tracker.printDoseHistory();
        // should print the log entry for that prescription

        // comparing what we got vs what we expect
        System.out.println("-------------------------------------");
        System.out.println("Expected Output:");
        System.out.println("Prescription created and sent to patient P1.");
        System.out.println("Dose log saved: took=YES, time=08:00, dose=500 mg");
        System.out.println("== Dose Log History ==");
        System.out.println("Patient P1 took Rx#1 at 08:00 (500 mg)");
        System.out.println("===== End of TC01 Test =====");
    }
}
