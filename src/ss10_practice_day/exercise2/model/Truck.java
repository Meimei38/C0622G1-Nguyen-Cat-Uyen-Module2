package ss10_practice_day.exercise2.model;

public class Truck extends Vehicle {
    private double load;

    public Truck() {
    }

    public Truck(double load) {
        this.load = load;
    }

    public Truck(String registrationPlate, String manufacturer, String productionYear, String ownerName, double load) {
        super(registrationPlate, manufacturer, productionYear, ownerName);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "load=" + load +
                "} " + super.toString();
    }
}
