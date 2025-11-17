// Abhiram Allugubelli
// TC02 Negative Test Case (Invalid Patient ID)
// This tests behavior when a doctor enters a patient ID that does NOT exist

public class TC02_InvalidPatientID2 {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("TC02 – Negative Test Case (Invalid Patient ID)")
        System.out.println("========================================");
        System.out.println();

        // test inputs
        String doctorName = "Dr. Smith";
        String invalidID = "P99";       // invalid patient ID for this test
        String medication = "Amoxicillin";
        String dosage = "500 mg";

        // create tracker object with invalid patient ID
        MedicationTracker tracker = new MedicationTracker(invalidID);

        // try adding a prescription for a non-existent patient
        System.out.println("------------ Actual Output ------------");
        tracker.addPrescription(medication, dosage, doctorName);

        // expected output
        System.out.println("------------ Expected Output ----------");
        System.out.println("System should display an error message:");
        System.out.println("\"Patient ID not found. Please verify patient information.\"");
        System.out.println("No prescription should be created.");
        System.out.println();

        // tester note
        System.out.println("Note:");
        System.out.println("MedicationTracker.java does NOT currently detect invalid");
        System.out.println("patient IDs. This test case shows a missing validation feature.");
        System.out.println();

        System.out.println("End of TC02 – Negative Test Case");
    }
}
