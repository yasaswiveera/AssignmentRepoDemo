// Yasaswi Veera
//
// checking how the program behaves when the doctor enters an invalid date range
// (the end date is set before the start date)
// the system should display an error instead of saving the medication information

public class TC04_InvalidMedicationDates {

    public static void main(String[] args) {

        // beginning of test case 4
        System.out.println("TC04 - Negative Test Case (Invalid Medication Dates)");
        System.out.println("testing a case where the end date comes before the start date");
        System.out.println();

        // creating a medication tracker for one patient
        // patient ID “P1” is used for consistency across all test cases
        MedicationTracker tracker = new MedicationTracker("P1");

        // entering all the usual details for a new medication
        // doctor and medication name are valid
        // but the start and end dates are intentionally incorrect
        String doctor = "Dr. Smith";               // valid doctor name
        String med = "Ibuprofen";                  // valid medication name
        String dosage = "200mg";                   // valid dosage amount
        String startDate = "2025-11-20";           // later start date
        String endDate = "2025-11-10";             // earlier end date → invalid order

        // testing how the system reacts to the invalid date order
        // it should detect the problem and display an appropriate error message
        System.out.println("===============ACTUAL VALUE===============");
        tracker.addPrescription(med
