package ss10_practice_day.exercise2.service.impl;

import ss10_practice_day.exercise2.model.Motorbike;
import ss10_practice_day.exercise2.model.Truck;
import ss10_practice_day.exercise2.service.IMotorbikeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorbikeService implements IMotorbikeService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Motorbike> motorbikes = new ArrayList<>();

    static {
        motorbikes.add(new Motorbike("95-H1 56361", "Honda", "2020", "Võ Thị H", 100));
        motorbikes.add(new Motorbike("43-K6 19472", "Suzuki", "2019", "Phan Quang K", 120));
    }

    @Override
    public void addMotorbike() {
        Motorbike motorbike = this.getMotorbikeInfo();
        motorbikes.add(motorbike);
        System.out.println("Thêm mới xe máy thành công!");
    }

    @Override
    public void displayMotorbike() {
        for (Motorbike motorbike : motorbikes) {
            System.out.println(motorbike);
        }
    }

    @Override
    public void deleteMotorbike() {
        Motorbike motorbike = this.findMotorbike();
        if (motorbike == null) {
            System.out.println("Không tìm thấy đối tượng xe máy cần xóa!");
        } else {
            System.out.println("Bạn có chắc chắn muốn xóa xe máy mang biển kiểm soát " + motorbike.getRegistrationPlate() + " không?");
            System.out.println("1. Có");
            System.out.println("2. Không");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                motorbikes.remove(motorbike);
                System.out.println("Đã xóa đối tượng xe máy thành công!");
            }
        }
    }

    @Override
    public List<Motorbike> searchForObject(String input) {
        List<Motorbike> motorbikeInfo = new ArrayList<>();
        for (int i = 0; i < motorbikes.size(); i++) {
            if (motorbikes.get(i).getRegistrationPlate().contains(input)) {
                motorbikeInfo.add(motorbikes.get(i));
            }

        }
        return motorbikeInfo;
    }


    private Motorbike findMotorbike() {
        System.out.println("Vui lòng nhập biển kiểm soát xe máy: ");
        String motorbikeRegistrationPlate = scanner.nextLine();
        for (int i = 0; i < motorbikes.size(); i++) {
            if (motorbikes.get(i).getRegistrationPlate().equals(motorbikeRegistrationPlate)) {
                return motorbikes.get(i);
            }

        }
        return null;
    }

    private Motorbike getMotorbikeInfo() {
        System.out.println("Vui lòng nhập biển số kiểm soát của xe máy: ");
        String motorbikeRegistrationPlate = scanner.nextLine();
        System.out.println("Vui lòng nhập tên hãng sản xuất xe tải: ");
        String motorManufacturer = scanner.nextLine();
        System.out.println(" Vui lòng nhập năm sản xuất: ");
        String motorProductionYear = scanner.nextLine();
        System.out.println("Vui lòng nhập tên chủ sở hữu");
        String motorbikeOwnerName = scanner.nextLine();
        System.out.println("Vui lòng nhập công suất xe máy: ");
        int motorbikeCapacity = Integer.parseInt(scanner.nextLine());
        Motorbike motorbike = new Motorbike(motorbikeRegistrationPlate, motorManufacturer, motorProductionYear, motorbikeOwnerName, motorbikeCapacity);
        return motorbike;
    }
}
