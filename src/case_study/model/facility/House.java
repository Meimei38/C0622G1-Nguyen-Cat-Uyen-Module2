package case_study.model.facility;

import case_study.model.facility.Facility;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloor;

    public House() {
    }

    public House(String roomStandard, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String serviceName, double area, double rentPrice, int maxOccupancy, String rentType, String roomStandard, int numberOfFloor) {
        super(serviceName, area, rentPrice, maxOccupancy, rentType);
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                "} " + super.toString();
    }
}
