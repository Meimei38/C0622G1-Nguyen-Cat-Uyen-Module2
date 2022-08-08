package ss6_inheritance.thuc_hanh.geometric_shapes.controller;

import ss6_inheritance.thuc_hanh.geometric_shapes.model.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("red", false);
        System.out.println(shape1);
    }
}
