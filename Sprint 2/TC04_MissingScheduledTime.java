// Yasaswi Veera
//
// testing what happens if the prescription is missing its scheduled time
// this should make the program show an error instead of marking any dose as missed

public class TC04_MissingScheduledTime {

    public static void main(String[] args) {

        // starting test case 4
        System.out.println("TC04 - Negative Test Case (Missing Scheduled Time)");
        System.out.println("testing case where the scheduled time field is empty");
        System.out.println();

        // creating a medication tracker for one patient
        // using patient ID "P1" for consistency across all test cases
        MedicationTrackerSprintTwo tracker = new MedicationTrackerSprintTwo("P1");

        // setting up a prescription with missing scheduled time
        // prescription number is fine, but scheduled time is blank on purpose
        int prescriptionNumber = 2;
        String scheduledTime = "";       // left blank intentionally
        String currentTime = "07:59";    // current time is valid
        boolean doseLogged = true;       // dose marked as logged

        // we’re testing how the program handles a missing scheduled time
        // ideally, it should show an error message, not try to compare times
        System.out.println("===============ACTUAL VALUE===============");
        tracker.checkMissedDose(prescriptionNumber, scheduledTime, currentTime, doseLogged);

        // here’s what we EXPECT the program to say if it’s working correctly
        System.out.println("===============EXPECTED VALUE===============");
        System.out.println("Scheduled time missing for Prescription# 2.");
        System.out.println("Doctor or admin should update the prescription information.");

        // spacing for readability
        System.out.println();

        // marking the end of this test case
        System.out.println("End of TC04 Negative Test Case");
        System.out.println();
        System.out.println("// finished checking missing scheduled time handling");
        System.out.println("// system should not record a missed dose");
        System.out.println("// program should only display the error message above");
    }
}
