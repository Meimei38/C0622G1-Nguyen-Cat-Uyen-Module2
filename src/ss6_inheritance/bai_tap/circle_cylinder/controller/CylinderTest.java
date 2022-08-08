package ss6_inheritance.bai_tap.circle_cylinder.controller;

import ss6_inheritance.bai_tap.circle_cylinder.model.Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder(3.5, 2.5, "green");
        System.out.println(cylinder1);
    }
}
