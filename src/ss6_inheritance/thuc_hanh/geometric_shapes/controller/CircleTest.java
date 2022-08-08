package ss6_inheritance.thuc_hanh.geometric_shapes.controller;

import ss6_inheritance.thuc_hanh.geometric_shapes.model.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(3.5);
        System.out.println(circle1);
        Circle circle2 = new Circle(3.5, "indigo", false);
        System.out.println(circle2);

    }
}
