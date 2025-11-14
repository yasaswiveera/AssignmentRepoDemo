// ahmad

// verify that a dose logged at or BEFORE the scheduled time is NOT marked as missed.

// i assume MedicationTracker.checkMissedDose(int, String, String, boolean) is implemented

public class TC02_IncorrectTimeComparison {
    public static void main(String[] args) {

        //test header
        System.out.println("TC02 - Negative Test Case (Incorrect Time Comparison)");
        System.out.println("Scenario: Dose is logged one minute BEFORE scheduled time (should NOT be missed).");
        System.out.println();

        //implementing pre conditions
        MedicationTrackerSprintTwo tracker = new MedicationTrackerSprintTwo("P1");

        //inputs
        int prescriptionNumber = 1; // P# 1
        String scheduledTime = "08:00"; // scheduled time
        String currentTime = "07:59"; // actual log time
        boolean doseLogged = true; // patient marked the dose as taken

        //actions
        //compare scheduledTime vs currentTime
        System.out.println("===============ACTUAL VALUE===============");
        tracker.checkMissedDose(prescriptionNumber, scheduledTime, currentTime, doseLogged);

        //expectation ---------------
        //show what the correct behavior should be
        System.out.println("===============EXPECTED VALUE===============");
        System.out.println("No missed doses detected for P1.");
        System.out.println("Nothing new is added to the missed dose list.");
        System.out.println("The system keeps the log marked as 'taken'.");

        //footer
        System.out.println();
        System.out.println("End of TC02 Negative Test Case");
        System.out.println();
        System.out.println("// As Per SRS FR07 and FR08, a taken dose with a valid timestamp at/before schedule should not count as missed. This test ensures the time comparison logic is correct.");
    }
}
