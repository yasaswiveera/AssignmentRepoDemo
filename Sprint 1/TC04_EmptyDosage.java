// Vaishnavi Madagiri

// testing what happens if doctor forgets to type the dosage
// this should make the program show an error instead of saving the prescription
public class TC04_EmptyDosage {

    public static void main(String[] args) {

        // starting test case 4
        System.out.println("TC04 - Negative Test Case (Empty Dosage)");
        System.out.println("testing case where dosage is left blank");
        System.out.println();

        // making tracker for one patient
        // using patient ID "P1" like in the other test cases so it’s consistent
        MedicationTracker tracker = new MedicationTracker("P1");

        // setting up all the info we normally need to add a prescription
        // doctor name is fine, medication name is fine
        // but dosage is left empty on purpose
        String doctor = "Dr. Smith";        // valid doctor
        String med = "Amoxicillin";         // valid medication name
        String dose = "";                   // left blank intentionally

        // we’re testing how the program reacts when this happens
        // ideally, it should catch the empty dosage and show an error message
        System.out.println("===============ACTUAL VALUE===============");
        tracker.addPrescription(med, dose, doctor); // this should not add anything

        // here we type out what we EXPECT the program to say if it’s working right
        // so we can compare the console output easily
        System.out.println("===============EXPECTED VALUE===============");
        System.out.println("Error: check your parameter values.");

        // printing an empty line for spacing in console
        System.out.println();

        // note for myself to mark the end of this test
        System.out.println("End of TC04 Negative Test Case");
        System.out.println();
        System.out.println("// finished checking empty dosage error");
        System.out.println("// no prescription should have been added for this test");
        System.out.println("// program should only show the error message above");
    }
}
