package ss3_array_and_methods.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        do {
            System.out.print("Nhập vào số phần tử của mảng 1: ");
            num1 = scanner.nextInt();
        } while (num1 <= 0);
        int[] arr1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            System.out.print("Nhập phần tử thứ " + i + ":");
            arr1[i] = scanner.nextInt();
        }
        do {
            System.out.print("Nhập vào số phần tử của mảng 2: ");
            num2 = scanner.nextInt();
        } while (num2 <= 0);
        int[] arr2 = new int[num1];
        for (int i = 0; i < num2; i++) {
            System.out.print("Nhập phần tử thứ " + i + ":");
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[(num1 + num2)];
        for (int i = 0; i < num1; i++) {
            arr3[i] = arr1[i];
        }
        int j = 0;
        for (int i = num1; i <= (num2 * 2); i++) {
            arr3[i] = arr2[j];
            j++;
        }
        System.out.print(Arrays.toString(arr3));
    }
}
