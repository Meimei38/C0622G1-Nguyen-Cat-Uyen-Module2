package ss10_practice_day.exercise1.service;

import ss10_practice_day.exercise1.model.Student;

public interface IStudentService {
    void addStudent();

    void displayStudentList();

    void deleteStudent();


    Student findStudent();

    void findStudentByName();

    void sortByName();
}
