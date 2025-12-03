
// Sprint 3 - NotificationSystem.java
// Group Members: Abhiram Allugubelli, Vaishnavi Madagiri, Pooja Challala,
// Yasaswi Veera, Bella Lopez, Ahmed Siddiq

// This class represents the logic for the medication reminder feature
// Each test case (TC01–TC04) directly calls the checkReminder() method
// to validate how the system responds to various reminder conditions
public class NotificationSystem {

    private String patientId;

    // constructor for patient-specific reminder system
    public NotificationSystem(String patientId) {
        this.patientId = patientId;
    }

    /**
     * Main use-case function that every test case calls.
     * This covers TC01, TC02, TC03, and TC04.
     *
     * @param prescriptionNumber ID number for the prescription being checked
     * @param scheduledTime The expected reminder time
     * @param notificationsEnabled Indicates whether patient has reminders ON/OFF
     */
    public void checkReminder(int prescriptionNumber,
                              String scheduledTime,
                              boolean notificationsEnabled) {


        // TC04 — Missing time data
        // If the scheduled time is null or unreadable, the system must:
        //  - Display an error
        //  - Avoid sending a reminder
        //  - Continue running without crashing
        if (scheduledTime == null || scheduledTime.trim().isEmpty()) {
            System.out.println("Cannot send reminder: scheduled time not available.");
            System.out.println("No reminder should be sent, and the system should continue running safely.");
            return;
        }

        // TC02 — notifications OFF
        // Patient has disabled reminders for all prescriptions
        // System should remain silent and avoid sending any reminder
        if (!notificationsEnabled) {
            System.out.println("Notifications are disabled. No reminder sent.");
            return;
        }

        // If notifications ON and time is valid = TC01 and TC03
        // Notifications are enabled and scheduled time is valid
        // The system should generate the proper reminder message
        System.out.println("Reminder: It’s time to take Prescription #" + prescriptionNumber + ".");
    }
}
