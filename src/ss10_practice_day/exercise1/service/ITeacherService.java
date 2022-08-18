package ss10_practice_day.exercise1.service;

import ss10_practice_day.exercise1.model.Teacher;

public interface ITeacherService {
    void addTeacher();

    void deleteTeacher();

    void displayTeacher();

    Teacher findTeacher();

    void findTeacherByName();

    void sortByName();
}
