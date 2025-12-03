// Ahmed Abubakr Siddiq
// Positive test case: doctor adds two valid prescriptions and
// patient successfully logs two doses (morning and evening).

public class TC06_MultipleValidDoses {

    public static void main(String[] args) {

        System.out.println("TC06 - Positive Test Case (Multiple Valid Doses)");
        System.out.println("Verifying that multiple prescriptions and doses are stored correctly.\n");

        // create a tracker for existing patient P1
        MedicationTracker tracker = new MedicationTracker("P1");

        System.out.println("===============ACTUAL VALUE===============");

        // ---- First prescription + dose ----
        System.out.println("Adding first prescription for Amoxicillin...");
        tracker.addPrescription("Amoxicillin", "500 mg", "Dr. Smith");

        System.out.println("Logging morning dose at 08:00...");
        tracker.logDose(true, "08:00", "500 mg");

        // ---- Second prescription + dose ----
        System.out.println("\nAdding second prescription for Ibuprofen...");
        tracker.addPrescription("Ibuprofen", "200 mg", "Dr. Jones");

        System.out.println("Logging evening dose at 20:00...");
        tracker.logDose(true, "20:00", "200 mg");

        // show what actually ended up in the history
        tracker.printDoseHistory();

        System.out.println("===========EXPECTED VALUE============");
        System.out.println("No error messages should appear.");
        System.out.println("Dose history should contain two entries for patient P1");
        System.out.println(" - One entry showing Rx#1 taken at 08:00 (500 mg)");
        System.out.println(" - One entry showing Rx#2 taken at 20:00 (200 mg)");
        System.out.println("This confirms that multiple valid prescriptions and doses");
        System.out.println("are recorded in order for the same patient.\n");

        System.out.println("End of TC06 Positive Test Case");
    }
}