import java.util.*;
import java.time.LocalTime;
public class UpdateAppointment {
    public static void main(String[] args) {
        LinkedList<Appointment> appointments = new LinkedList<>();
        appointments.add(new Appointment(101, LocalTime.of(10, 30), 2));
        appointments.add(new Appointment(102, LocalTime.of(9, 30), 3));
        appointments.add(new Appointment(103, LocalTime.of(11, 0), 1));
        appointments.add(new Appointment(104, LocalTime.of(10, 0), 2));
        // ListIterator to traverse and update appointments
        System.out.println("USING LISTITERATOR:");
        ListIterator<Appointment> lit = appointments.listIterator();
        while (lit.hasNext()) {
            Appointment a = lit.next();
            if (a.patientId == 101) {
                a.status = "Completed";
                lit.set(a);
            }
        }
        // Display updated appointments
        for (Appointment a : appointments) {
            System.out.println(a);
        }
    }
}
