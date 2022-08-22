package ss10_practice_day.exercise1.service;

import ss10_practice_day.exercise1.model.Teacher;

import java.io.IOException;

public interface ITeacherService {
    void addTeacher() throws IOException;

    void deleteTeacher() throws IOException;

    void displayTeacher() throws IOException;

    Teacher findTeacher();

    void findTeacherByName();

    void sortByName() throws IOException;
}
