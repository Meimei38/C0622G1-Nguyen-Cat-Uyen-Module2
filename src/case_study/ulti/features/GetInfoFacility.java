package case_study.ulti.features;

import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetInfoFacility {
    String serviceCode;
    String serviceName;
    double area;
    double rentPrice;
    int maxOccupancy;
    String rentType;
    List<Villa> villaList = new ArrayList<>();
    List<House> houseList = new ArrayList<>();
    List<Room> roomList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void getInfoFacility() {
        System.out.println("Enter service name: ");
        serviceName = scanner.nextLine();
        System.out.println("Enter area: ");
        area = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rent price: ");
        rentPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter max occupancy: ");
        maxOccupancy = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rent type: ");
        rentType = scanner.nextLine();
    }

    public Villa getInfoVilla() {
        getInfoFacility();
        String roomStandard;
        System.out.println("Enter room standard: ");
        roomStandard = scanner.nextLine();
        double areaOfPool;
        System.out.println("Enter area of the pool: ");
        areaOfPool = Double.parseDouble(scanner.nextLine());
        int numberOfFloor;
        System.out.println("Enter number of floor: ");
        numberOfFloor = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(serviceCode, serviceName, area, rentPrice, maxOccupancy, rentType, roomStandard, areaOfPool, numberOfFloor);
        if (villaList.size() == 0) {
            villa.setServiceCode("SVVL-1");
        } else {
            String[] number = villaList.get(villaList.size() - 1).getServiceCode().split("-");
            int num = Integer.parseInt(number[1]);
            num += 1;
            villa.setServiceCode("SVVL-" + num);
        }
        villaList.add(villa);
        return villa;
    }

    public House getInfoHouse() {
        getInfoFacility();
        String roomStandard;
        System.out.println("Enter room standard: ");
        roomStandard = scanner.nextLine();
        int numberOfFloor;
        System.out.println("Enter number of floor: ");
        numberOfFloor = Integer.parseInt(scanner.nextLine());
        House house = new House(serviceCode, serviceName, area, rentPrice, maxOccupancy, rentType, roomStandard, numberOfFloor);
        if (houseList.size() == 0) {
            house.setServiceCode("SVHO-1");
        } else {
            String[] number = houseList.get(houseList.size() - 1).getServiceCode().split("-");
            int num = Integer.parseInt(number[1]);
            num += 1;
            house.setServiceCode("SVHO-" + num);
        }
        houseList.add(house);
        return house;
    }

    public Room getInfoRoom() {
        getInfoFacility();
        String freeService;
        System.out.println("Enter free service");
        freeService = scanner.nextLine();
        Room room = new Room(serviceCode, serviceName, area, rentPrice, maxOccupancy, rentType, freeService);
        if (roomList.size() == 0) {
            room.setServiceCode("SVRO-1");
        } else {
            String[] number = roomList.get(roomList.size() - 1).getServiceCode().split("-");
            int num = Integer.parseInt(number[1]);
            num += 1;
            room.setServiceCode("SVHO-" + num);
        }
        roomList.add(room);
        return room;
    }
}
