// Bella lopez
// Verify that taking a dose at the exact scheduled time (same minute) will mark the dose as taken

public class TC03_SameMinuteGraceLimit {
    public static void main(String[] args) {
        // Test info
        System.out.println("TC03 - Boundary Test Case (Same-Minute Grace Limit");
        System.out.println("Testing case where " +
                "system accepts a dose that is logged exactly at the scheduled time (the boundary point) as being on time.");
        System.out.println();

        // preconditions
        MedicationTracker tracker = new MedicationTracker("P1"); // instantiate medication tracker for patient P1
        int prescriptionNumber = 1; // P# 1
        String scheduledTime = "08:00"; // scheduled time
        String currentTime = "08:00"; // actual logged time
        boolean doseLogged = true; // mark the dose as taken

        // run test actions
        // compare scheduledTime vs currentTime
        System.out.println("===============ACTUAL VALUE===============");
        tracker.checkMissedDose(prescriptionNumber, scheduledTime, currentTime, doseLogged);
        System.out.println();

        // expectation ---------------
        // prints expected behavior and results
        System.out.println("===============EXPECTED VALUE===============");
        System.out.println("No missed doses detected for P1.");
        System.out.println("Nothing new is added to the missed dose list.");
        System.out.println("The system keeps the log marked as 'taken'.");
        System.out.println();

        // test end
        System.out.println("End of TC02 Negative Test Case");
        System.out.println();
        System.out.println("// A dose taken at exactly the scheduled time should not be marked as missed.");
        System.out.println("// Passed tests means time comparison logic is working correctly.");
    }
}