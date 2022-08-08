package ss6_inheritance.bai_tap.point2d_point3d.controller;

import ss6_inheritance.bai_tap.point2d_point3d.model.Point3D;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        Point3D point3D1 = new Point3D(2.3f, 3.7f, 1.8f);
        System.out.println(point3D1);
    }
}
