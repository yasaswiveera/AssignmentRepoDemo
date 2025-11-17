//Pooja Challala
// This test case creates a patient tracker, prescripton and logs a dose at the earlist time of the (00:00).

public class TC03_BoundaryTime {

    public static void main(String[] args) {

        System.out.println("TC03 – Boundary Test: Earliest Valid Dose Time");
        System.out.println("Verifying system behavior when logging a dose at 00:00\n");

        // Create a medication tracker for the patient
        MedicationTracker tracker = new MedicationTracker("P1");

        // Prescription must exist before dose logging
        System.out.println("Adding prescription for patient...");
        tracker.addPrescription("Amoxicillin", "500 mg", "Dr. Smith");

        // Attempt to log the earliest valid time
        System.out.println("Attempting to log dose at 00:00...");
        tracker.logDose(true, "00:00", "500 mg");

        // Confirm that the time was actually stored
        System.out.println("\nDose history now contains:");
        tracker.printDoseHistory();

        // Expected outcome
        System.out.println("Expected: Dose should be recorded with time: 00:00");
    }
}
