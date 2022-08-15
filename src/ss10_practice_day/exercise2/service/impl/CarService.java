package ss10_practice_day.exercise2.service.impl;

import ss10_practice_day.exercise2.model.Car;
import ss10_practice_day.exercise2.service.ICarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("43-A1 54326", "Suzuki", "2010", "Lê Thị D", 6, "Minivan"));
        cars.add(new Car("92-G5 72198", "Toyota", "2003", "Phan Văn E", 4, "Sports car"));
    }

    @Override
    public void addCar() {
        Car car = this.getCarInfo();
        cars.add(car);
        System.out.println("Thêm mới xe hơi thành công!");

    }

    @Override
    public void displayCar() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    @Override
    public void deleteCar() {
        Car car = this.findCar();
        if (car == null) {
            System.out.println("Không tìm thấy đối tượng xe hơi cần xóa!");
        } else {
            System.out.println("Bạn có chắc chắn muốn xóa đối tượng xe hơi mang biển kiểm soát " + car.getRegistrationPlate() + " không?");
            System.out.println("1. Có");
            System.out.println("2. Không");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                cars.remove(car);
                System.out.println("Đã xóa đối tượng xe hơi thành công!");
            }
        }
    }

    @Override
    public List<Car> searchForObject(String input) {
        List<Car> carInfo = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getRegistrationPlate().contains(input)) {
                carInfo.add(cars.get(i));
            }

        }
        return carInfo;
    }


    private Car findCar() {
        System.out.println("Vui lòng nhập biển kiểm soát xe hơi: ");
        String carRegistrationPlate = scanner.nextLine();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getRegistrationPlate().equals(carRegistrationPlate)) {
                return cars.get(i);
            }

        }
        return null;
    }

    private Car getCarInfo() {
        System.out.println("Vui lòng nhập biển số kiểm soát của xe hơi");
        String carRegistrationPlate = scanner.nextLine();
        System.out.println("Vui lòng nhập tên hãng sản xuất xe hơi: ");
        String carManufacturer = scanner.nextLine();
        System.out.println(" Vui lòng nhập năm sản xuất: ");
        String carProductionYear = scanner.nextLine();
        System.out.println("Vui lòng nhập tên chủ sở hữu");
        String carOwnerName = scanner.nextLine();
        System.out.println("Vui lòng nhập số lượng chỗ ngồi của xe: ");
        int seatingCapacity = Integer.parseInt(scanner.nextLine());
        System.out.println("Vui lòng nhập loại xe hơi: ");
        String carType = scanner.nextLine();
        Car car = new Car(carRegistrationPlate, carManufacturer, carProductionYear, carOwnerName, seatingCapacity, carType);
        return car;
    }
}
