package ss6_inheritance.bai_tap.point_movable_point.controller;

import ss6_inheritance.bai_tap.point_movable_point.model.MovablePoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        MovablePoint movablePoint1 = new MovablePoint(3.5f, 2.5f);
        System.out.println(movablePoint1);
        movablePoint1.move();
        System.out.println(movablePoint1);
    }
}
