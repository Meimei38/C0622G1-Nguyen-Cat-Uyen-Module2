package ss3_array_and_methods.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        /*Tìm giá trị nhỏ nhất trong mảng*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int num = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {

            System.out.println("Enter the element of the array: ");
            arr[i] = Integer.parseInt(scanner.nextLine());

        }
        System.out.println("Your array is " + Arrays.toString(arr));
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == min) {
                System.out.printf("Index of min value: [%d]", i);
                System.out.println();
            }


        }
        System.out.printf("Min value %d ", min);


    }
}
