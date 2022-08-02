package ss2_loop_statements.bai_tap.display_geometric_shapes;

import java.util.Scanner;

public class DisplayIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter length: ");
        int height = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height * 2; j++) {
                if ((j > height - i) && (j < height + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
