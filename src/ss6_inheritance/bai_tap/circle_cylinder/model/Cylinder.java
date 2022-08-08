package ss6_inheritance.bai_tap.circle_cylinder.model;

public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder() {

    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return super.getArea() + super.getPerimeter() * height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "This is a cylinder with: " +
                "height= " + height +
                ", area= " + getArea() +
                ", volume= " + getVolume() +
                ".\nThis cylinder is a subclass of a circle, which has " + super.toString();
    }
}
