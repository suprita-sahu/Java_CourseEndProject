import java.util.*;
public class PatientMap {
    public static void main(String[] args) {
        // HashMap to store patient details
        HashMap<Integer, Patient> patients = new HashMap<>();
        // Adding patient details
        patients.put(101, new Patient(101, "Rahul", 25, "Fever"));
        patients.put(102, new Patient(102, "Priya", 30, "Cold"));
        patients.put(103, new Patient(103, "Amit", 45, "Heart Pain"));
        patients.put(104, new Patient(104, "Sneha", 20, "Headache"));
        // Retrieve patient using HashMap
        System.out.println("PATIENT DETAILS:");
        Patient p = patients.get(103);
        System.out.println(p);
    }
}
