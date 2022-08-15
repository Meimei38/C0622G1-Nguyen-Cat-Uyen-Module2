package ss10_practice_day.exercise2.model;

public class Vehicle {
    private String registrationPlate;
    private String manufacturer;
    private String productionYear;
    private String ownerName;

    public Vehicle() {
    }

    public Vehicle(String registrationPlate, String manufacturer, String productionYear, String ownerName) {
        this.registrationPlate = registrationPlate;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.ownerName = ownerName;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "registrationPlate='" + registrationPlate + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", productionYear=" + productionYear +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
