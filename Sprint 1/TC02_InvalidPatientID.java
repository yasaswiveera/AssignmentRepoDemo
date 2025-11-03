// Vaishnavi Madagiri

// testing what happens if doctor tries to add a prescription
// but the medication name is null, should show error message
public class TC02_InvalidPatientID {

    public static void main(String[] args) {

        // starting test case 2
        System.out.println("TC02 - Negative Test Case (Null Medication)");
        System.out.println();

        // setting up patient and doctor info
        String patientID = "P1";   // existing patient
        String doctor = "Dr. Smith";  // doctor name
        String med = null;            // testing with null value for medication
        String dose = "500 mg";       // normal dose

        // making tracker object for patient P1
        MedicationTracker tracker = new MedicationTracker(patientID);

        // now trying to add a prescription with null medication name
        // expecting the program to catch it and show error
        System.out.println("===============ACTUAL VALUE===============");
        tracker.addPrescription(med, dose, doctor);

        // now writing what we expected it to say
        System.out.println("===============EXPECTED VALUE===============");
        System.out.println("Error: check your parameter values.");

        // done testing this one
        System.out.println();
        System.out.println("End of TC02 Negative Test Case");
    }
}
