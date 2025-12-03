//ahmed

//confirm that the system triggers a reminder exactly at the scheduled boundary time
public class TC03_ReminderAtExactMinute {
    public static void main(String[] args) {
        //test header
        System.out.println("TC03 - Boundary Test Case (Reminder at Exact Minute)");
        System.out.println("Objective: Confirm that the system triggers reminder exactly at the scheduled boundary time.");
        System.out.println();

        //implementing preconditions
        System.out.println("Preconditions:");
        System.out.println("-Application is running.");
        System.out.println("-Patient P1 exists.");
        System.out.println("-Prescription #2 is scheduled for 09:30 AM.");
        System.out.println("-Notifications are enabled.");
        System.out.println();

        //inputs
        String patientId = "P1";
        int prescriptionNumber = 2;
        String scheduledTime = "09:30";   // 09:30 AM scheduled time
        String currentTime   = "09:30";   // system time reaches 09:30 exactly
        boolean notificationsOn = true;   // notifications enabled

        System.out.println("=============== INPUT VALUES ===============");
        System.out.println("Patient ID         : " + patientId);
        System.out.println("Prescription Number: " + prescriptionNumber);
        System.out.println("Scheduled Time     : " + scheduledTime);
        System.out.println("Current Time       : " + currentTime);
        System.out.println("Notifications      : " + (notificationsOn ? "ON" : "OFF"));
        System.out.println();

        //test steps
        System.out.println("Test Steps:");
        System.out.println("  1. System time reaches 09:30 AM exactly.");
        System.out.println("  2. Reminder engine executes.");
        System.out.println();

        //simulated system behavior
        boolean reminderFired = false;
        boolean duplicateReminder = false;
        boolean delayedReminder = false;

        //simple boundary checker
        if (notificationsOn && currentTime.equals(scheduledTime)) {
            //first reminder
            reminderFired = true;
            duplicateReminder = false;
            delayedReminder = false;
        }

        System.out.println("=========== ACTUAL SYSTEM BEHAVIOR =========");
        if (reminderFired) {
            System.out.println("Reminder fired at " + currentTime
                    + " for patient " + patientId
                    + ", prescription #" + prescriptionNumber + ".");
        } else {
            System.out.println("Reminder did NOT fire at " + currentTime + ".");
        }
        if (!delayedReminder) {
            System.out.println("Reminder was not delayed (sent at boundary time).");
        } else {
            System.out.println("Reminder was delayed past the boundary time.");
        }
        if (!duplicateReminder) {
            System.out.println("No early or duplicate reminders were generated.");
        } else {
            System.out.println("Duplicate / early reminder was detected.");
        }
        System.out.println();

        //expected results
        System.out.println("=============== EXPECTED RESULTS ===========");
        System.out.println("• Reminder fires at exactly 09:30 AM.");
        System.out.println("• System does not delay notification.");
        System.out.println("• No early / duplicate reminders.");
        System.out.println();

        //end of test case
        System.out.println("End of TC03 Boundary Test Case (Reminder at Exact Minute).");
        System.out.println("Compare ACTUAL SYSTEM BEHAVIOR above with EXPECTED RESULTS.");
    }
}
