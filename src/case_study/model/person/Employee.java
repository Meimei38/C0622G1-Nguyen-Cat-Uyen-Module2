package case_study.model.person;

public class Employee extends Person {
    private String educationalLevel;
    private String position;
    private double salaryRate;

    public Employee() {
    }

    public Employee(String educationalLevel, String position, double salaryRate) {
        this.educationalLevel = educationalLevel;
        this.position = position;
        this.salaryRate = salaryRate;
    }

    public Employee(String code, String name, String dateOfBirth, String gender, int id, String phoneNumber, String email, String educationalLevel, String position, double salaryRate) {
        super(code, name, dateOfBirth, gender, id, phoneNumber, email);
        this.educationalLevel = educationalLevel;
        this.position = position;
        this.salaryRate = salaryRate;
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

    public double getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "educationalLevel='" + educationalLevel + '\'' +
                ", position='" + position + '\'' +
                ", salaryRate=" + salaryRate +
                "} " + super.toString();
    }
}
