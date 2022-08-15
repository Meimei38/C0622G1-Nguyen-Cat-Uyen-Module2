package ss10_practice_day.exercise2.controller;


import ss10_practice_day.exercise2.model.Truck;
import ss10_practice_day.exercise2.service.ICarService;
import ss10_practice_day.exercise2.service.IMotorbikeService;
import ss10_practice_day.exercise2.service.ITruckService;
import ss10_practice_day.exercise2.service.impl.CarService;
import ss10_practice_day.exercise2.service.impl.MotorbikeService;
import ss10_practice_day.exercise2.service.impl.TruckService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static ITruckService truckService = new TruckService();
    private static ICarService carService = new CarService();
    private static IMotorbikeService motorbikeService = new MotorbikeService();


    public static void menuManagement() {
        while (true) {
            System.out.println("Chào mừng bạn đến với Chương trình quản lý phương tiện giao thông!");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Tìm kiếm theo biển kiểm soát");
            System.out.println("5. Thoát");
            System.out.println("Vui lòng chọn chức năng để tiếp tục: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    chooseObjectToAdd();
                    break;
                case 2:
                    chooseObjectToDisplay();
                    break;
                case 3:
                    chooseObjectToDelete();
                    break;
                case 4:
                    searchForObject();
                    break;
                case 5:
                    return;
            }
        }


    }

    private static void searchForObject() {
        System.out.println("Vui lòng nhập vào thông tin cần tìm kiếm: ");
        String input = scanner.nextLine();
        truckService.searchForObject(input);
        carService.searchForObject(input);
        motorbikeService.searchForObject(input);
        List searchResult = new ArrayList();
        if (truckService.searchForObject(input) != null) {
            searchResult.addAll(truckService.searchForObject(input));
        }
        if (carService.searchForObject(input) != null) {
            searchResult.addAll(carService.searchForObject(input));
        }
        if (motorbikeService.searchForObject(input) != null) {
            searchResult.addAll(motorbikeService.searchForObject(input));
        }
        if (searchResult.isEmpty()) {
            System.out.println("Không tìm thấy đối tượng xe khớp yêu cầu!");
        } else {
            for (int i = 0; i < searchResult.size(); i++) {
                System.out.println(searchResult.get(i));
            }
        }


    }


    private static void chooseObjectToDelete() {
        while (true) {
            System.out.println("1. Xóa xe tải");
            System.out.println("2. Xóa thị ô tô");
            System.out.println("3. Xóa thị xe máy");
            System.out.println("4. Thoát");
            System.out.println("Vui lòng lựa chọn đối tượng để tiếp tục: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    truckService.deleteTruck();
                    break;
                case 2:
                    carService.deleteCar();
                    break;
                case 3:
                    motorbikeService.deleteMotorbike();
                    break;
                case 4:
                    return;
            }

        }
    }

    private static void chooseObjectToDisplay() {
        while (true) {
            System.out.println("1. Hiển thị xe tải");
            System.out.println("2. Hiển thị ô tô");
            System.out.println("3. Hiển thị xe máy");
            System.out.println("4. Thoát");
            System.out.println("Vui lòng lựa chọn đối tượng để tiếp tục: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    truckService.displayTruck();
                    break;
                case 2:
                    carService.displayCar();
                    break;
                case 3:
                    motorbikeService.displayMotorbike();
                    break;
                case 4:
                    return;
            }

        }
    }

    private static void chooseObjectToAdd() {
        while (true) {

            System.out.println("1. Thêm xe tải");
            System.out.println("2. Thêm ô tô");
            System.out.println("3. Thêm xe máy");
            System.out.println("4. Thoát");
            System.out.println("Vui lòng lựa chọn đối tượng để tiếp tục: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    truckService.addTruck();
                    break;
                case 2:
                    carService.addCar();
                    break;
                case 3:
                    motorbikeService.addMotorbike();
                    break;
                case 4:
                    return;

            }
        }

    }
}
