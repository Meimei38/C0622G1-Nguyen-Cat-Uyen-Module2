package ss10_practice_day.exercise2.service;

import ss10_practice_day.exercise2.model.Car;

import java.util.List;

public interface ICarService {
    void addCar();

    void displayCar();

    void deleteCar();

    List<Car> searchForObject(String input);
}
