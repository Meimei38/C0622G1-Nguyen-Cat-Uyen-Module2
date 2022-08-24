package ss10_practice_day.exercise1.model;

public class Teacher extends Person {
    private String position;

    public Teacher() {
    }

    public Teacher(String position) {
        this.position = position;
    }

    public Teacher(int id, String name, String gender, String dateOfBirth, String position) {
        super(id, name, gender, dateOfBirth);
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(",%s", position);
    }
}
