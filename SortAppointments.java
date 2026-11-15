import java.util.*;
import java.time.LocalTime;
public class SortAppointments {
    public static void main(String[] args) {
        LinkedList<Appointment> appointments = new LinkedList<>();
        appointments.add(new Appointment(101, LocalTime.of(10, 30), 2));
        appointments.add(new Appointment(102, LocalTime.of(9, 30), 3));
        appointments.add(new Appointment(103, LocalTime.of(11, 0), 1));
        appointments.add(new Appointment(104, LocalTime.of(10, 0), 2));
        // Sort appointments by time, then priority
        Collections.sort(appointments, new Comparator<Appointment>() {
            public int compare(Appointment a, Appointment b) {
                int result = a.time.compareTo(b.time);
                if (result == 0) {
                    return Integer.compare(a.priority, b.priority);
                }
                return result;
            }
        });
        System.out.println("APPOINTMENTS SORTED BY TIME AND PRIORITY:");
        for (Appointment a : appointments) {
            System.out.println(a);
        }
        // Sort appointments by priority
        Collections.sort(appointments, new Comparator<Appointment>() {
            public int compare(Appointment a, Appointment b) {
                return Integer.compare(a.priority, b.priority);
            }
        });
        System.out.println("\nAPPOINTMENTS SORTED BY PRIORITY:");
        for (Appointment a : appointments) {
            System.out.println(a);
        }
    }
}
