//Pooja Challala  

import java.util.ArrayList;
import java.util.List;

public class TC01_MissedDoseDetected {

    public static void main(String[] args) {

        // Test info
        System.out.println("TC01 - Positive Test Case (Detect Missed Dose Automatically)");
        System.out.println("Testing case where the system correctly identifies and records a missed dose when");
        System.out.println("the scheduled time has passed with no logged dose entry.");
        System.out.println();

        // ================= PRECONDITIONS =================
        MedicationTracker tracker = new MedicationTracker("P1"); // patient P1
        int prescriptionNumber = 1; // Prescription #1
        String scheduledTime = "08:00"; // scheduled dose at 8 AM
        String currentTime = "08:30"; // current time 8:30 AM
        boolean doseLogged = false;  // dose NOT logged yet

        // =============== ACTUAL SYSTEM BEHAVIOR ===============
        System.out.println("=============== ACTUAL VALUE ===============");
        tracker.checkMissedDose(prescriptionNumber, scheduledTime, currentTime, doseLogged);
        System.out.println();

        // =============== EXPECTED RESULTS ===============
        System.out.println("=============== EXPECTED VALUE ===============");
        System.out.println("Missed dose detected for Prescription #1 (P1).");
        System.out.println("Dose should be marked as 'missed' and saved with timestamp 08:30.");
        System.out.println("The missed dose should appear in the patient's medication history.");
        System.out.println();

        // test end
        System.out.println("End of TC01 Positive Test Case");
        System.out.println();
        System.out.println("// A dose not logged by the scheduled time should always be marked as missed.");
        System.out.println("// Passed tests mean missed-dose detection logic works correctly.");
    }
}

// Supporting Class: MedicationTracker

class MedicationTracker {

    private String patientID;
    private List<String> missedDoseHistory;

    public MedicationTracker(String patientID) {
        this.patientID = patientID;
        this.missedDoseHistory = new ArrayList<>();
    }

    /**
     * Checks if a dose is missed based on scheduledTime and currentTime.
     */
    public void checkMissedDose(int prescriptionNumber,
                                String scheduledTime,
                                String currentTime,
                                boolean doseLogged) {

        // If dose has already been taken → no missed
        if (doseLogged) {
            System.out.println("No missed doses detected for " + patientID + ".");
            return;
        }

        // Compare times (string comparison works because format is HH:MM)
        if (currentTime.compareTo(scheduledTime) > 0) {

            String record = "Prescription #" + prescriptionNumber +
                    " missed at " + currentTime +
                    " (scheduled for " + scheduledTime + ").";

            missedDoseHistory.add(record);

            System.out.println("Missed dose detected for Prescription #" +
                    prescriptionNumber + " (" + patientID + ").");
            System.out.println("Reason: Scheduled time passed with no logged dose.");
            System.out.println("Recorded: " + record);

        } else {
            System.out.println("Dose is still on time. No missed dose.");
        }
    }

    public List<String> getMissedDoseHistory() {
        return missedDoseHistory;
    }
}
