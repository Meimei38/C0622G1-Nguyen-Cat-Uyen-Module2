package ss4_class_object.bai_tap.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter c: ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquationClass quadraticEquation = new QuadraticEquationClass(a, b, c);
        if (quadraticEquation.getDiscriminant() == 0) {
            System.out.printf("Your quadratic equation has 2 roots with a same value: %.2f \n", quadraticEquation.getRoot0());
        } else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.printf("Your quadratic equation has 2 roots: %.2f and %.2f \n", quadraticEquation.getRoot1(), quadraticEquation.getRoot2());

        } else {
            System.out.println("The equation has no roots.");
        }


    }
}

