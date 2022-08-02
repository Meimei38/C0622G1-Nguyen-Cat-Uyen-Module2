package ss2_loop_statements.bai_tap.display_geometric_shapes;

import java.util.Scanner;

public class DisplayTriangleFromBottomLeft {
    public static void main(String[] args) {
        //Display a triangle from bottom left
        Scanner scanner=new Scanner(System.in);
        int length;
        System.out.println("Enter length: ");
        length=scanner.nextInt();
        for (int i =1; i <=length ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
