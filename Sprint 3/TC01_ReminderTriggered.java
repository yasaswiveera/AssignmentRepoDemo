// Pooja Challala
// TC01_ReminderTriggered.java
// Test will verify that the system sends a reminder when the scheduled time arrives.

public class TC01_ReminderTriggered {
    public static void main(String[] args) {

        // test header
        System.out.println("TC01 - Positive Test Case (Reminder Triggered on Time)");
        System.out.println("Objective: Verify that the system sends a reminder when the scheduled medication time arrives.");
        System.out.println();

        // preconditions
        String patientId = "P1";
        int prescriptionNumber = 1;
        String scheduledTime = "08:00";
        String currentTime = "08:00";
        boolean notificationsOn = true;  

        // notifications enabled for patient
       NotificationSystem system = new NotificationSystem(patientId); 

        // input values
        System.out.println("=========== INPUT VALUES ===========");
        System.out.println("Patient ID:        " + patientId);
        System.out.println("Prescription #:    " + prescriptionNumber);
        System.out.println("Scheduled Time:    " + scheduledTime);
        System.out.println("Current Time:      " + currentTime);
        System.out.println("Notifications:    " + (notificationsOn ? "ON" : "OFF"));
        System.out.println();

        // actual results
        System.out.println("============== ACTUAL VALUE ==============");
        system.checkReminder(prescriptionNumber, scheduledTime, notificationsOn); // performs reminder logic
        System.out.println();

        // expected results
        System.out.println("============== EXPECTED VALUE ==============");
        System.out.println("System prints: \"Reminder: It’s time to take Prescription #1.\"");
        System.out.println("Notification appears before the dose is marked missed.");
        System.out.println("Dose remains in pending status.");
        System.out.println();

        // test end
        System.out.println("End of TC01 - Positive Test Case (Reminder Triggered on Time)");
        System.out.println();
    }
}
