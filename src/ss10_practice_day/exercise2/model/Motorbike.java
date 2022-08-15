package ss10_practice_day.exercise2.model;

public class Motorbike extends Vehicle {
    private int capacity;

    public Motorbike() {
    }

    public Motorbike(int capacity) {
        this.capacity = capacity;
    }

    public Motorbike(String registrationPlate, String manufacturer, String productionYear, String ownerName, int capacity) {
        super(registrationPlate, manufacturer, productionYear, ownerName);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "capacity=" + capacity +
                "} " + super.toString();
    }
}
