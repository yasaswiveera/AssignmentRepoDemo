// Yasaswi Veera
//
// testing how the system handles missing or corrupted scheduled time data
// the system should show an error message and avoid sending a reminder

public class TC04_InvalidNotificationTime {

    public static void main(String[] args) {

        // beginning of test case 4
        System.out.println("TC04 - Negative Test Case (Invalid Notification Time Data)");
        System.out.println("testing scenario where the scheduled time for a reminder is missing or unreadable");
        System.out.println();

        // creating a tracker for one patient
        // using patient ID 'P1' like in previous test cases for consistency
        NotificationSystem system = new NotificationSystem("P1");

        // setting up prescription information
        // prescription number exists but the scheduled time is intentionally null
        int prescriptionNumber = 3;
        String scheduledTime = null;       // represents corrupted or missing data
        boolean notificationsEnabled = true;  // notifications are turned ON

        // running the reminder check to see how the system responds
        // it should detect the issue and show an appropriate error message
        System.out.println("===============ACTUAL VALUE===============");
        system.checkReminder(prescriptionNumber, scheduledTime, notificationsEnabled);

        // expected program output if implemented correctly
        System.out.println("===============EXPECTED VALUE===============");
        System.out.println("Cannot send reminder: scheduled time not available.");
        System.out.println("No reminder should be sent, and the system should continue running safely.");

        // blank line for console readability
        System.out.println();

        // marking the end of this test case
        System.out.println("End of TC04 Negative Test Case");
        System.out.println();
        System.out.println("// finished testing invalid or missing scheduled time");
        System.out.println("// system should display the above error and avoid sending a reminder");
        System.out.println("// no crash or reminder should occur for this case");
    }
}
