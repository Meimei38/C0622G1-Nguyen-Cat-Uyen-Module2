package ss3_array_and_methods.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInMatrix {
    public static void main(String[] args) {
        /* Viết một ứng dụng cho phép người dùng nhập vào một ma trận số thực
        sau đó tìm ra tọa độ cũng như giá trị của phần tử lớn nhất.*/

        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[5][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the element of the array: ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());

            }

        }
        System.out.printf("Your array is %s", Arrays.deepToString(arr));
        System.out.println();
        int max = arr[0][0];

        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == max) {
                    System.out.printf("Index of max value: [%d,%d]", i, j);
                    System.out.println();
                }

            }

        }
        System.out.printf("Max value %d ", max);

    }
}
