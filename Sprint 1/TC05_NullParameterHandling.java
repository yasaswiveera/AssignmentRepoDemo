// Bella Lopez
// negative test case to verify that system can handle null input fields safely.

public class TC05_NullParameterHandling {

    public static void main(String[] args) {

        // test info
        System.out.println("TC05 - Negative Test Case (Null Parameter Handling)");
        System.out.println("Testing that the system safely rejects null prescription fields.");
        System.out.println();

        // instantiate a tracker for patient
        MedicationTracker tracker = new MedicationTracker("P1");

        // test actions
        System.out.println("===============ACTUAL VALUE===============");
        // attempt to add prescription with null doctorName
        tracker.addPrescription("Ibuprofen", "200 mg", null);
        // attempt to add prescription with null medication name
        tracker.addPrescription(null, "5 mg", "Dr. Jones");
        // attempt to add prescription with null dosage
        tracker.addPrescription("Prednisone", null, "Dr. Carter");

        // print dose history to confirm no prescriptions were added
        tracker.printDoseHistory();
        System.out.println();

        System.out.println("===============EXPECTED VALUE===============");
        System.out.println("Error: check your parameter values.\n" +
                "Error: check your parameter values.\n" +
                "Error: check your parameter values.\n");
        System.out.println("== Dose Log History ==");
        System.out.println("(no dose logs yet)");
        System.out.println();

        System.out.println("// test finished");
        System.out.println("// program should print 3 input errors followed by an empty dose log");
        System.out.println("// success means the program handles null parameters properly");

    }
}
