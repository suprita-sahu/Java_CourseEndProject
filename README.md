# Patient & Appointment Management System

A Java-based application designed to manage patient records and schedule medical appointments. Built as a course-end project, this system demonstrates object-oriented programming, collections management, custom sorting, and file persistence.

## Overview & Architecture

The codebase is organized into modular classes handling data models, collections, operations, and storage:

* **Data Models**
  * `Patient.java` — Defines patient attributes and records.
  * `Appointment.java` — Represents scheduled appointments, including time and priority details.
* **Data Structures & Storage**
  * `PatientMap.java` — Stores and retrieves patient records using key-value mapping.
  * `AppointmentList.java` — Maintains the list of scheduled appointments.
  * `SaveAndLoad.java` — Handles file input/output to save and load records across sessions.
* **Appointment Operations**
  * `UpdateAppointment.java` — Modifies details of existing appointments.
  * `RemoveAppointment.java` — Deletes or cancels scheduled appointments.
  * `SortAppointments.java` — Orders appointments dynamically by scheduled time and priority level.

## Setup & Usage

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/suprita-sahu/Java_CourseEndProject.git](https://github.com/suprita-sahu/Java_CourseEndProject.git)
   cd Java_CourseEndProject
   ```

2. **Compile the source files:**
   ```bash
   javac *.java
   ```

3. **Run the application:**
   *(Requires an entry-point class containing `public static void main(String[] args)`)*
   ```bash
   java Main
   ```
