package ss10_practice_day.exercise1.service;

import ss10_practice_day.exercise1.model.Student;

import java.io.IOException;

public interface IStudentService {
    void addStudent() throws IOException;

    void displayStudentList() throws IOException;

    void deleteStudent() throws IOException;


    Student findStudent();

    void findStudentByName();

    void sortByName() throws IOException;
}
