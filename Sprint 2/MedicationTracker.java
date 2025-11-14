// Sprint 2 - MedicationTracker.java
// Group Members: Abhiram Allugubelli, Vaishnavi Madagiri, Pooja Challala,
// Yasaswi Veera, Bella Lopez, Ahmed Siddiq

public class MedicationTracker {
    // Represents a single patient in the system
    private String patientId;

    // Initializes the tracker with a patient ID
    public MedicationTracker(String patientId) {
        this.patientId = patientId;
    }

    /**
     * This method checks whether a medication dose was missed or logged on time.
     * It also handles missing or invalid data.
     *
     * @param prescriptionNumber  unique prescription ID for the medication
     * @param scheduledTime       time when the dose was supposed to be taken (8:00)
     * @param currentTime         current system time when the check runs (1:00)
     * @param doseLogged          true if the patient logged the dose, false otherwise
     */
    public void checkMissedDose(int prescriptionNumber,
                                String scheduledTime,
                                String currentTime,
                                boolean doseLogged) {

        // 1. Handles missing data case
        // If no scheduled time was entered the system cannot compare times, so it shows an error message
        if (scheduledTime == null || scheduledTime.isEmpty()) {
            System.out.println("Scheduled time missing for Prescription# " + prescriptionNumber + ".");
            System.out.println("Doctor or admin should update the prescription information.");
            return;
        }

        // 2. Converts times into numbers
        // Replace ':' with '.' so we can compare times as decimal values.
        double scheduled = Double.parseDouble(scheduledTime.replace(":", "."));
        double current = Double.parseDouble(currentTime.replace(":", "."));

        // 3. Compares the times and dose status
        // Ex. Case A: Dose is not logged OR logged after the scheduled time = mark as missed
        if (!doseLogged || current > scheduled) {
            System.out.println("Missed dose detected for Prescription# "
                    + prescriptionNumber + " (" + patientId + ").");
        }

        // Ex. Case B: Dose was logged early or on time → no missed dose
        else {
            System.out.println("No missed doses detected for " + patientId + ".");
        }
    }
}
