import java.util.*;
import java.io.*;
import java.time.LocalTime;
public class SaveAndLoad {
    public static void main(String[] args) {
        LinkedList<Appointment> appointments = new LinkedList<>();
        HashMap<Integer, Patient> patients = new HashMap<>();
        patients.put(101, new Patient(101, "Rahul", 25, "Fever"));
        patients.put(102, new Patient(102, "Priya", 30, "Cold"));
        appointments.add(new Appointment(101, LocalTime.of(10, 30), 2));
        appointments.add(new Appointment(102, LocalTime.of(9, 30), 3));
        // Serialization: Save appointments and patients
        try {
            ObjectOutputStream out =
                new ObjectOutputStream(
                    new FileOutputStream("hospital.dat"));
            out.writeObject(appointments);
            out.writeObject(patients);
            out.close();
            System.out.println("Data saved successfully!");
        }
        catch (IOException e) {
            System.out.println(e);
        }
        // Deserialization: Read saved data
        try {
            ObjectInputStream in =
                new ObjectInputStream(
                    new FileInputStream("hospital.dat"));
            LinkedList<Appointment> savedAppointments =
                (LinkedList<Appointment>) in.readObject();
            HashMap<Integer, Patient> savedPatients =
                (HashMap<Integer, Patient>) in.readObject();
            in.close();
            System.out.println("\nRETRIEVED DATA:");
            for (Appointment a : savedAppointments) {
                System.out.println(a);
            }
            System.out.println("\nRetrieved Patient:");
            System.out.println(savedPatients.get(101));
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
