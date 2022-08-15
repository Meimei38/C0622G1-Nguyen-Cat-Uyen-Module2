package ss10_practice_day.exercise2.service;

import ss10_practice_day.exercise2.model.Motorbike;

import java.util.List;

public interface IMotorbikeService {
    void addMotorbike();

    void displayMotorbike();

    void deleteMotorbike();

    List<Motorbike> searchForObject(String input);
}
