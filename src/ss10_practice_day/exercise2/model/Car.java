package ss10_practice_day.exercise2.model;

public class Car extends Vehicle {
    private int seatingCapacity;
    private String type;

    public Car() {
    }

    public Car(int seatingCapacity, String type) {
        this.seatingCapacity = seatingCapacity;
        this.type = type;
    }

    public Car(String registrationPlate, String manufacturer, String productionYear, String ownerName, int seatingCapacity, String type) {
        super(registrationPlate, manufacturer, productionYear, ownerName);
        this.seatingCapacity = seatingCapacity;
        this.type = type;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seatingCapacity=" + seatingCapacity +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }
}
