package ss3_array_and_methods.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4};

        System.out.println("Please enter the number to remove from the array: ");
        int number = scanner.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == number) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];

                }
                arr[arr.length - 1] = 0;

            }
        }
        System.out.println(Arrays.toString(arr));

    }
}