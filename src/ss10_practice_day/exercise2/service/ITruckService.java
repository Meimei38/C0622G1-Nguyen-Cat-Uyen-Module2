package ss10_practice_day.exercise2.service;

import ss10_practice_day.exercise2.model.Truck;

import java.util.List;

public interface ITruckService {
    void addTruck();

    void displayTruck();

    void deleteTruck();

    List<Truck> searchForObject(String input);
}
