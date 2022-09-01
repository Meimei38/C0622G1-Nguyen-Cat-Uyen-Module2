package case_study.model.person;

public class Employee extends Person {
    private String educationalLevel;
    private String position;
    private double wage;

    public Employee() {
    }

    public Employee(String educationalLevel, String position, double wage) {
        this.educationalLevel = educationalLevel;
        this.position = position;
        this.wage = wage;
    }

    public Employee(String code, String name, String dateOfBirth, String gender, String id, String phoneNumber, String email, String educationalLevel, String position, double wage) {
        super(code, name, dateOfBirth, gender, id, phoneNumber, email);
        this.educationalLevel = educationalLevel;
        this.position = position;
        this.wage = wage;
    }

    public String getEducationalLevel() {
        return educationalLevel;
    }

    public void setEducationalLevel(String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "educationalLevel='" + educationalLevel + '\'' +
                ", position='" + position + '\'' +
                ", salaryRate=" + wage +
                "} " + super.toString();
    }

}
