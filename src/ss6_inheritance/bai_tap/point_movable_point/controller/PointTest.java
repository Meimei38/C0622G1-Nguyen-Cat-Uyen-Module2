package ss6_inheritance.bai_tap.point_movable_point.controller;

import ss6_inheritance.bai_tap.point_movable_point.model.Point;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        Point point1 = new Point(2.5f, 3.1f);
        System.out.println(point1);
    }
}
