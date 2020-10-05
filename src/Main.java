import model.Student;

public class Main {

    public static void main(String[] args) {
        Student john = new Student(
                "John Emmanuel",
                "Bacalla",
                23,
                "Male",
                "2020M01");
        System.out.println("First Name: " + john.getFirstName());
        System.out.println("Last Name: " + john.getLastName());
        System.out.println("Age: " + john.getAge());
        System.out.println("Gender: " + john.getGender());
        System.out.println("ID No: " + john.getIdNo());
    }
}
