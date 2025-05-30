//4. You are working on a student information system and need to create a Student class. The student class should have private instance variables for the student's name, ID number, and grade point average (GPA). Implement getter and setter methods for the name and ID number, ensuring that they can be accessed and modified only through these methods. However, the GPA should be read-only and can only be set within the class constructo

public class Student {
    // Private instance variables
    private String name;
    private String idNumber;
    private double gpa; // GPA is read-only

    // Constructor
    public Student(String name, String idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa; // GPA can only be set here
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for ID Number
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    // Getter for GPA (no setter to keep it read-only)
    public double getGpa() {
        return gpa;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Student student = new Student("Alice", "S12345", 3.8);

        System.out.println("Name: " + student.getName());
        System.out.println("ID Number: " + student.getIdNumber());
        System.out.println("GPA: " + student.getGpa());

        student.setName("Lin Yi");
        student.setIdNumber("S12346");

        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated ID Number: " + student.getIdNumber());
        // student.setGpa(4.0); // Not allowed — no setter for GPA
    }
}
