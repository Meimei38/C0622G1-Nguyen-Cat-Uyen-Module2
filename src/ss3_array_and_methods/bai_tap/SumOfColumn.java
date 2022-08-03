package ss3_array_and_methods.bai_tap;


import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int arrRow = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of columns: ");
        int arrColumn = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[arrRow][arrColumn];
        for (int i = 0; i < arrRow; i++) {
            for (int j = 0; j < arrColumn; j++) {
                System.out.println("Enter the element of the array: ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        int column;
        do {
            System.out.println("Enter the column to sum: ");
            column = Integer.parseInt(scanner.nextLine());
            if (column < 0 || column > arrColumn - 1) {
                System.out.println("Invalid column. The column added must be [0,arrColumn-1]");
            }
        } while (column < 0 || column > arrColumn - 1);

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i][column];
        }

        System.out.printf("Sum for column %d is %d", column, total);
    }

}




