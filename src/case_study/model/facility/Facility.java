package case_study.model.facility;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private double area;
    private double rentPrice;
    private int maxOccupancy; //Số người tối đa
    private String rentType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, double area, double rentPrice, int maxOccupancy, String rentType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.area = area;
        this.rentPrice = rentPrice;
        this.maxOccupancy = maxOccupancy;
        this.rentType = rentType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }
    public abstract String getInfo();

    @Override
    public String toString() {
        return "Facility{" +
                "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", rentPrice=" + rentPrice +
                ", maxOccupancy=" + maxOccupancy +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
