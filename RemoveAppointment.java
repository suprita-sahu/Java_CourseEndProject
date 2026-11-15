import java.util.*;
import java.time.LocalTime;
public class RemoveAppointment {
    public static void main(String[] args) {
        LinkedList<Appointment> appointments = new LinkedList<>();
        appointments.add(new Appointment(101, LocalTime.of(10, 30), 2));
        appointments.add(new Appointment(102, LocalTime.of(9, 30), 3));
        appointments.add(new Appointment(103, LocalTime.of(11, 0), 1));
        appointments.add(new Appointment(104, LocalTime.of(10, 0), 2));
        // Iterator to traverse and remove an appointment
        System.out.println("USING ITERATOR:");
        Iterator<Appointment> it = appointments.iterator();
        while (it.hasNext()) {
            Appointment a = it.next();
            System.out.println(a);
            // Remove appointment if patient ID is 102
            if (a.patientId == 102) {
                it.remove();
                System.out.println("Appointment removed!");
            }
        }
        // Display remaining appointments
        System.out.println("\nREMAINING APPOINTMENTS:");
        for (Appointment a : appointments) {
            System.out.println(a);
        }
    }
}
