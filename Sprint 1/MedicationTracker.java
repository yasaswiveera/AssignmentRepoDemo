
import java.util.ArrayList;

public class MedicationTracker {

    // variables (store patient info, prescriptions, and dose logs)
    private String patientID;
    private ArrayList<String> prescriptions;
    private ArrayList<String> doseLogs;

    // constructor – runs when we make a new MedicationTracker object
    public MedicationTracker(String id) {
        // check if the ID is valid
        if (id == null || id.trim().isEmpty()) {
            System.out.println("Error: invalid patient id.");
            id = "UNKNOWN"; // default name if it's invalid
        }
        patientID = id;
        prescriptions = new ArrayList<>(); // make an empty list for prescriptions
        doseLogs = new ArrayList<>();      // make an empty list for dose logs
    }

    // method to add a prescription for the patient
    public void addPrescription(String medication, String dosage, String doctorName) {
        // check if any of the parameters are missing or empty
        if (medication == null || dosage == null || doctorName == null
                || medication.trim().isEmpty() || dosage.trim().isEmpty() || doctorName.trim().isEmpty()) {
            System.out.println("Error: check your parameter values.");
            return; // stop the method early if something is wrong
        }

        // auto-number the prescription (Rx#1, Rx#2, etc.)
        int rxNumber = prescriptions.size() + 1;
        String info = "Rx#" + rxNumber + " - " + medication + " - " + dosage + " - prescribed by " + doctorName;

        // add this new prescription to the list
        prescriptions.add(info);

        // print a confirmation message
        System.out.println("Prescription created and sent to patient " + patientID + ".");
    }

    // method to log a dose (when the patient takes the medicine)
    public void logDose(boolean tookIt, String timeTaken, String doseTaken) {
        // check if time or dose is empty
        if (timeTaken == null || doseTaken == null
                || timeTaken.trim().isEmpty() || doseTaken.trim().isEmpty()) {
            System.out.println("Error: time and dose must not be empty.");
            return;
        }

        // if there are no prescriptions yet, label it as unknown
        String rxLabel = prescriptions.isEmpty() ? "Rx#?" : "Rx#" + prescriptions.size();

        // make a sentence describing what happened
        String log = "Patient " + patientID + " took " + rxLabel + " at " + timeTaken + " (" + doseTaken + ")";
        doseLogs.add(log); // add it to the doseLogs list

        // print a message depending on if the patient took it or not
        if (tookIt) {
            System.out.println("Dose log saved: took=YES, time=" + timeTaken + ", dose=" + doseTaken);
        } else {
            System.out.println("Dose log saved: took=NO, time=" + timeTaken + ", dose=" + doseTaken);
        }
    }

    // method to print out all dose logs that have been saved
    public void printDoseHistory() {
        System.out.println();
        System.out.println("== Dose Log History ==");
        // if no doses have been logged yet, print that
        if (doseLogs.isEmpty()) {
            System.out.println("(no dose logs yet)");
        } else {
            // print every log from the list
            for (String doseLog : doseLogs) {
                System.out.println(doseLog);
            }
        }
        System.out.println();
        System.out.println("End of TC01 Positive Test Case");
    }

    // main method – this runs the program
    public static void main(String[] args) {

        System.out.println("Medication Tracker Running...");
        System.out.println();

        // make a new tracker for patient P1
        MedicationTracker tracker = new MedicationTracker("P1");

        // add one prescription for this patient
        tracker.addPrescription("Amoxicillin", "500 mg", "Dr. Smith");

        // log that the patient took it at 8:00 AM
        tracker.logDose(true, "08:00", "500 mg");

        // print the full dose history at the end
        tracker.printDoseHistory();
    }
}
