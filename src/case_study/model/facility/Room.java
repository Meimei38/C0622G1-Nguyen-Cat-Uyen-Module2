package case_study.model.facility;

import case_study.model.facility.Facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%f,%f,%d,%s,%s", getServiceCode(), getServiceName(), getArea(), getRentPrice(), getMaxOccupancy(), getRentType(), getFreeService());
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceCode, String serviceName, double area, double rentPrice, int maxOccupancy, String rentType, String freeService) {
        super(serviceCode, serviceName, area, rentPrice, maxOccupancy, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                "} " + super.toString();
    }
}
