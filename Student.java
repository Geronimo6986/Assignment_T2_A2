import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student extends StudentCourses {
    String name;
    String dob;

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of student: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ritul S Mamdapur";
        s.displayName();
        s.displayAge("17-09-2004");
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.displayStudentMarks();
    }
}



// public class StudentCourses {

//     private String[] courseCodes = { "C#", "ST", "ML", "DEVOPS", "PALR" };
//     private int[] marks = { 85, 92, 75, 88, 95 };

//     public void displayStudentMarks() {
//         System.out.println("Course Codes \t Marks Obtained");

//         for (int i = 0; i < courseCodes.length; i++) {
//                 System.out.println(courseCodes[i] + "\t\t\t" + marks[i]);
//         }
//     }

// }