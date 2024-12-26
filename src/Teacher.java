public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private double salary;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, double salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
        } else {
            throw new IllegalArgumentException("percentage must be positive.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + ".";
    }
}
