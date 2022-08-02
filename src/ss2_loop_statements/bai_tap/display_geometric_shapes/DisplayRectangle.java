package ss2_loop_statements.bai_tap.display_geometric_shapes;

import java.util.Scanner;

public class DisplayRectangle {
    public static void main(String[] args) {
        //Display a rectangle
        Scanner scanner = new Scanner(System.in);
        int width;
        System.out.println("Enter width: ");
        width = scanner.nextInt();
        int length;
        System.out.println("Enter length: ");
        length = scanner.nextInt();
        for (int i = 0; i <width ; i++) {
            for (int j = 0; j <length ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

}
