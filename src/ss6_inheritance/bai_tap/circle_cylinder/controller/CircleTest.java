package ss6_inheritance.bai_tap.circle_cylinder.controller;

import ss6_inheritance.bai_tap.circle_cylinder.model.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(3.5, "green");
        System.out.println(circle1);
    }
}
