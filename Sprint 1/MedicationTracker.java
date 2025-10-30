// Name: Vaishnavi Madagiri
// Date: 10/30/2025
// Assignment: Medication Tracker
// Description: basic program that stores prescriptions and dose logs for a patient

import java.util.ArrayList;

public class MedicationTracker {

    // variables
    String patientID;
    ArrayList<String> prescriptions;
    ArrayList<String> doseLogs;

    // constructor
    public MedicationTracker(String id) {
        patientID = id;
        prescriptions = new ArrayList<String>();
        doseLogs = new ArrayList<String>();
    }

    // method to add a prescription
    public void addPrescription(String medication, String dosage, String doctorName) {
        String info = "Rx#1 - " + medication + " - " + dosage + " - prescribed by " + doctorName;
        prescriptions.add(info);
        System.out.println("Prescription created and sent to patient " + patientID + ".");
    }

    // method to log a dose
    public void logDose(boolean tookIt, String timeTaken, String doseTaken) {
        String log = "Patient " + patientID + " took Rx#1 at " + timeTaken + " (" + doseTaken + ")";
        doseLogs.add(log);
        if (tookIt) {
            System.out.println("Dose log saved: took=YES, time=" + timeTaken + ", dose=" + doseTaken);
        } else {
            System.out.println("Dose log saved: took=NO, time=" + timeTaken + ", dose=" + doseTaken);
        }
    }

    // method to print dose history
    public void printDoseHistory() {
        System.out.println();
        System.out.println("== Dose Log History ==");
        for (int i = 0; i < doseLogs.size(); i++) {
            System.out.println(doseLogs.get(i));
        }
        System.out.println();
        System.out.println("End of TC01 Positive Test Case");
    }

    // main method
    public static void main(String[] args) {

        System.out.println("Medication Tracker Running...");
        System.out.println();

        // create a tracker object for patient P1
        MedicationTracker tracker = new MedicationTracker("P1");

        // add a prescription
        tracker.addPrescription("Amoxicillin", "500 mg", "Dr. Smith");

        // log the dose (true means YES they took it)
        tracker.logDose(true, "08:00", "500 mg");

        // show history
        tracker.printDoseHistory();
    }
}
