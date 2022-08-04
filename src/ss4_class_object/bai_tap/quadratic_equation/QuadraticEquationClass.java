package ss4_class_object.bai_tap.quadratic_equation;

import java.util.Scanner;

public class QuadraticEquationClass {
    double a;
    double b;
    double c;

    public QuadraticEquationClass(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        this.getDiscriminant();
        return (-this.b + Math.sqrt(this.getDiscriminant())) / 2;
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(this.getDiscriminant())) / 2;
    }

    public double getRoot0() {
        return -this.b / (2 * this.a);
    }


}
