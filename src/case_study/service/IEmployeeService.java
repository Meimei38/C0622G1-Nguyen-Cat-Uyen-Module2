package case_study.service;

import case_study.model.person.Employee;

public interface IEmployeeService extends IService {
    void addEmployee();

    void displayEmployee();

    void editEmployee();

    Employee findEmployee();
}
