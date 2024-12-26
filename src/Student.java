import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Student extends Person {
    private int studentID;
    private List<Integer> grades;
    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = new Random().nextInt(9000) + 1000;
        this.grades = new ArrayList<>();
    }
    public int getStudentID() {
        return studentID;
    }
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);        } else {
            throw new IllegalArgumentException("between 0 and 100.");
        }
    }
    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;        }
        return sum / (double) grades.size();
    }

    @Override    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}
