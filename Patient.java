import java.io.Serializable;
 
// Patient class
class Patient implements Serializable {
    int id;
    String name;
    int age;
    String disease;
 
    Patient(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }
 
    public String toString() {
        return id + " " + name + " " + age + " " + disease;
    }
}
