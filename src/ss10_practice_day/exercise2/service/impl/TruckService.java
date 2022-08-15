package ss10_practice_day.exercise2.service.impl;

import ss10_practice_day.exercise2.model.Truck;
import ss10_practice_day.exercise2.service.ITruckService;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Truck> trucks = new ArrayList<>();

    static {
        trucks.add(new Truck("43-D1 23789", "Thaco", "1989", "Nguyễn Văn A", 1.9));
        trucks.add(new Truck("75-F2 61554", "Toyota", "1993", "Trần Quang B", 3.5));
    }

    @Override
    public void addTruck() {
        Truck truck = this.getTruckInfo();
        trucks.add(truck);
        System.out.println("Thêm mới xe tải thành công!");

    }

    @Override
    public void displayTruck() {
        for (Truck truck : trucks) {
            System.out.println(truck);
        }

    }

    @Override
    public void deleteTruck() {
        Truck truck = this.findTruck();
        if (truck == null) {
            System.out.println("Không tìm thấy đối tượng xe tải cần xóa!");
        } else {
            System.out.println("Bạn có chắc chắn muốn xóa xe tải có biển kiểm soát " + truck.getRegistrationPlate() + " không?");
            System.out.println("1. Có");
            System.out.println("2. Không");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                trucks.remove(truck);
                System.out.println("Xóa đối tượng xe tải thành công!");
            }

        }
    }

    @Override
    public List<Truck> searchForObject(String input) {
        List<Truck> truckInfo = new ArrayList<>();
        for (int i = 0; i < trucks.size(); i++) {
            if (trucks.get(i).getRegistrationPlate().contains(input)) {
                truckInfo.add(trucks.get(i));
            }

        }
        return truckInfo;

    }


    private Truck findTruck() {
        System.out.println("Vui lòng nhập biển kiểm soát xe tải: ");
        String truckRegistrationPlate = scanner.nextLine();
        for (int i = 0; i < trucks.size(); i++) {
            if (trucks.get(i).getRegistrationPlate().equals(truckRegistrationPlate)) {
                return trucks.get(i);

            }

        }
        return null;
    }

    private Truck getTruckInfo() {
        System.out.println("Vui lòng nhập biển số kiểm soát của xe tải");
        String truckRegistrationPlate = scanner.nextLine();
        System.out.println("Vui lòng nhập tên hãng sản xuất xe tải: ");
        String truckManufacturer = scanner.nextLine();
        System.out.println(" Vui lòng nhập năm sản xuất: ");
        String truckProductionYear = scanner.nextLine();
        System.out.println("Vui lòng nhập tên chủ sở hữu");
        String truckOwnerName = scanner.nextLine();
        System.out.println("Vui lòng nhập trọng tải (đơn vị tấn): ");
        double truckLoad = Double.parseDouble(scanner.nextLine());
        Truck truck = new Truck(truckRegistrationPlate, truckManufacturer, truckProductionYear, truckOwnerName, truckLoad);
        return truck;

    }
}
