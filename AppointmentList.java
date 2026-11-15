import java.util.*;
import java.time.LocalTime;
public class AppointmentList {
    public static void main(String[] args) {
        // LinkedList to store appointments
        LinkedList<Appointment> appointments = new LinkedList<>();
        // Adding appointments
        appointments.add(new Appointment(101, LocalTime.of(10, 30), 2));
        appointments.add(new Appointment(102, LocalTime.of(9, 30), 3));
        appointments.add(new Appointment(103, LocalTime.of(11, 0), 1));
        appointments.add(new Appointment(104, LocalTime.of(10, 0), 2));
        // Display all appointments
        System.out.println("ALL APPOINTMENTS:");
        for (Appointment a : appointments) {
            System.out.println(a);
        }
    }
}
