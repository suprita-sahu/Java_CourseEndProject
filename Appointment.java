import java.io.Serializable;
import java.time.LocalTime;
// Appointment class
class Appointment implements Serializable {
    int patientId;
    LocalTime time;
    int priority;  // 1 = High, 2 = Medium, 3 = Low
    String status;
    Appointment(int patientId, LocalTime time, int priority) {
        this.patientId = patientId;
        this.time = time;
        this.priority = priority;
        this.status = "Scheduled";
    }
    public String toString() {
        return "Patient ID: " + patientId +
               ", Time: " + time +
               ", Priority: " + priority +
               ", Status: " + status;
    }
}
