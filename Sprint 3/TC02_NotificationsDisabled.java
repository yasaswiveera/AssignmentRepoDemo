// Bella Lopez
// test will verify that the system will not send reminders if patient's notifications are OFF

public class TC02_NotificationsDisabled {
    public static void main(String[] args) {
        // test header
        System.out.println("TC02 - Negative Test Case (Notifications Disabled)");
        System.out.println("Objective: Verify that the system does not send reminders when notifications are turned OFF.");
        System.out.println();

        // input values & preconditions
        String patientId = "P1";
        int prescriptionNumber = 1;
        String scheduledTime = "08:00";
        String currentTime   = "08:00";
        boolean notificationsOn = false;   // key part of test
        NotificationSystem system = new NotificationSystem(patientId); // notification system for patient

        // print inputs to verify
        System.out.println("=============== INPUT VALUES ===============");
        System.out.println("Patient ID         : " + patientId);
        System.out.println("Prescription Number: " + prescriptionNumber);
        System.out.println("Scheduled Time     : " + scheduledTime);
        System.out.println("Current Time       : " + currentTime);
        System.out.println("Notifications      : " + (notificationsOn ? "ON" : "OFF"));
        System.out.println();

        // actual results
        System.out.println("=============== ACTUAL VALUE ===============");

        // test to check reminder status
        system.checkReminder(prescriptionNumber, scheduledTime, notificationsOn);

        System.out.println();

        // expected behavior
        System.out.println("=============== EXPECTED VALUE =============");
        System.out.println("System prints: \"Notifications are disabled. No reminder sent.\"");
        System.out.println("No reminder is produced.");
        System.out.println();

        // test end
        System.out.println("End of TC02 - Negative Test Case (Notifications Disabled)");
        System.out.println();
    }
}
