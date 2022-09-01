package case_study.model.facility;

import case_study.model.facility.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private double areaOfPool;
    private int numberOfFloor;

    public Villa() {
    }

    public Villa(String roomStandard, double areaOfPool, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.areaOfPool = areaOfPool;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String serviceCode, String serviceName, double area, double rentPrice, int maxOccupancy, String rentType, String roomStandard, double areaOfPool, int numberOfFloor) {
        super(serviceCode,serviceName, area, rentPrice, maxOccupancy, rentType);
        this.roomStandard = roomStandard;
        this.areaOfPool = areaOfPool;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaOfPool() {
        return areaOfPool;
    }

    public void setAreaOfPool(double areaOfPool) {
        this.areaOfPool = areaOfPool;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", areaOfPool=" + areaOfPool +
                ", numberOfFloor=" + numberOfFloor +
                "} " + super.toString();
    }
}
