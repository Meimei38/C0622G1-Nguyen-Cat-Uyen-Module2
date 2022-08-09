package ss7_abstract_class_interface.bai_tap.resizable.controller;

import ss7_abstract_class_interface.bai_tap.resizable.model.Rectangle;
import ss7_abstract_class_interface.bai_tap.resizable.model.Shape;

public class ResizableShapeTest {
    public static void main(String[] args) {
        Shape shape = new Rectangle(1,2);
        ((Rectangle) shape).resize(12);
        System.out.println(shape);




    }
}
