package case_study.service.impl;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.service.IFacilityService;
import case_study.ulti.features.GetInfoFacility;
import case_study.ulti.read_write.ReadFile;
import case_study.ulti.read_write.WriteFile;

import java.util.ArrayList;
import java.util.List;

public class FacilityService implements IFacilityService {
    public static final String FACILITY_LIST_CSV = "src\\case_study\\data\\facility_list.csv";
    public static final String MAINTENANCE_LIST_CSV = "src\\case_study\\data\\facility_maintenance_list.csv";
    List<Facility> facilities = new ArrayList<>();


    @Override
    public void displayFacility() {
        facilities = readFileFacility(FACILITY_LIST_CSV);
        for (Facility facility : facilities) {
            System.out.println(facility);
        }
    }

    @Override
    public void displayFacilityMaintenance() {
        facilities = readFileFacility(MAINTENANCE_LIST_CSV);
        for (Facility facility : facilities) {
            System.out.println(facility);
        }

    }

    @Override
    public void addVilla() {
        facilities = readFileFacility(FACILITY_LIST_CSV);
        Villa villa = GetInfoFacility.getInfoVilla();
        facilities.add(villa);
        System.out.println("New villa added!");
        WriteFile.writeFile(FACILITY_LIST_CSV, convertListFacilityToListString(facilities));
    }

    @Override
    public void addHouse() {
        facilities = readFileFacility(FACILITY_LIST_CSV);
        House house = GetInfoFacility.getInfoHouse();
        facilities.add(house);
        System.out.println("New house added!");
        WriteFile.writeFile(FACILITY_LIST_CSV, convertListFacilityToListString(facilities));
    }

    @Override
    public void addRoom() {
        facilities = readFileFacility(FACILITY_LIST_CSV);
        Room room = GetInfoFacility.getInfoRoom();
        facilities.add(room);
        System.out.println("New room added!");
        WriteFile.writeFile(FACILITY_LIST_CSV, convertListFacilityToListString(facilities));
    }

    private List<Facility> readFileFacility(String src) {
        List<String> facilityList = ReadFile.readFile(src);
        List<Facility> facilities = new ArrayList<>();
        if (facilityList.size() == 0) {
            System.out.println("No data exists! Please add some information!");
        } else {
            String[] propertiesOfFacility;
            Villa villa;
            House house;
            Room room;
            for (int i = 0; i < facilityList.size(); i++) {
                propertiesOfFacility = facilityList.get(i).split(",");
                if (propertiesOfFacility[0].contains("VL")) {
                    villa = new Villa(propertiesOfFacility[0], propertiesOfFacility[1], Double.parseDouble(propertiesOfFacility[2]), Double.parseDouble(propertiesOfFacility[3]), Integer.parseInt(propertiesOfFacility[4]), propertiesOfFacility[5], propertiesOfFacility[6], Double.parseDouble(propertiesOfFacility[7]), Integer.parseInt(propertiesOfFacility[8]));
                    facilities.add(villa);
                } else if (propertiesOfFacility[0].contains("HO")) {
                    house = new House(propertiesOfFacility[0], propertiesOfFacility[1], Double.parseDouble(propertiesOfFacility[2]), Double.parseDouble(propertiesOfFacility[3]), Integer.parseInt(propertiesOfFacility[4]), propertiesOfFacility[5], propertiesOfFacility[6], Integer.parseInt(propertiesOfFacility[7]));
                    facilities.add(house);
                } else {
                    room = new Room(propertiesOfFacility[0], propertiesOfFacility[1], Double.parseDouble(propertiesOfFacility[2]), Double.parseDouble(propertiesOfFacility[3]), Integer.parseInt(propertiesOfFacility[4]), propertiesOfFacility[5], propertiesOfFacility[6]);
                    facilities.add(room);
                }

            }

        }
        return facilities;
    }

    private String convertFacilityToString(Facility facility) {
        return facility.getServiceCode() + "," + facility.getServiceName() + ","
                + facility.getArea() + "," + facility.getRentPrice() + ","
                + facility.getMaxOccupancy() + "," + facility.getRentType();
    }

    private List<String> convertListFacilityToListString(List<Facility> facilities) {
        List<String> strings = new ArrayList<>();
        for (Facility facility : facilities) {
            strings.add(convertFacilityToString(facility));
        }
        return strings;
    }

}
