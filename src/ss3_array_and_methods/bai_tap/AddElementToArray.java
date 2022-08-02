package ss3_array_and_methods.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter the number of the element: ");
            arr[i] = scanner.nextInt();

        }
        System.out.println("Please enter the number to add to the array: ");
        int number = scanner.nextInt();
        int index;
        do {
            System.out.println("Please enter the index to add the element: ");
            index = scanner.nextInt();
            if (index <= -1 || index >= arr.length - 1) {
                System.out.println("Invalid index. Please enter valid index [0;arr.length-1]");
            }

        } while (index <= -1 || index >= arr.length - 1);

        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = number;


        System.out.println(Arrays.toString(arr));

    }
}
