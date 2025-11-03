// Vaishnavi Madagiri

// testing dose log for earliest valid time (00:00)
public class TC03_BoundaryTime {

    public static void main(String[] args) {

        // starting test case 3
        System.out.println("TC03 - Boundary Test Case (Earliest Time)");
        System.out.println("checking if time 00:00 works when logging dose");
        System.out.println();

        // make tracker for patient
        MedicationTracker tracker = new MedicationTracker("P1");

        // doctor adds prescription first so dose can be logged
        System.out.println("doctor adds prescription");
        tracker.addPrescription("Amoxicillin", "500 mg", "Dr. Smith");

        // now logging dose at midnight (edge time)
        System.out.println("patient logs dose at 00:00");
        tracker.logDose(true, "00:00", "500 mg");

        // show dose history to confirm the time got saved properly
        System.out.println("showing dose history after logging:");
        tracker.printDoseHistory();

        // expected result message
        System.out.println("expected: dose should be saved with time = 00:00");
        System.out.println();
        System.out.println("End of TC03 Boundary Test Case");
    }
}
