package ss10_practice_day.exercise1.model;

public class Student extends Person {
    private String className;
    private double score;

    public Student() {
    }

    public Student(String className, double score) {
        this.className = className;
        this.score = score;
    }

    public Student(int id, String name, String gender, String dateOfBirth, String className, double score) {
        super(id, name, gender, dateOfBirth);
        this.className = className;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", score=" + score +
                "} " + super.toString();
    }
}
