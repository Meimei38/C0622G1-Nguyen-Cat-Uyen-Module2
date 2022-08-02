package ss2_loop_statements.bai_tap.display_geometric_shapes;

import java.util.Scanner;

public class DisplayTriangleFromTopLeft {
    public static void main(String[] args) {
//Display a triangle from top left
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.println("Enter length: ");
        length = scanner.nextInt();
        for (int i = length; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
